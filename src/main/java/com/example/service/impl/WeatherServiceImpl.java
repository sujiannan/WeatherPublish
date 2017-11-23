package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.pojo.RetMsg;
import com.example.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private RestTemplate restTemplate;
	
	private static final String WEB_PATH = "http://www.sojson.com/open/api/weather/json.shtml?city=";
	
	@Override
	public RetMsg getWeatherByCity(String city) {
		String path = WEB_PATH + city;
		System.out.println(path);
		ResponseEntity<RetMsg> response = restTemplate.getForEntity(path, RetMsg.class);
		if(response != null) {
			if(response.getStatusCodeValue() == 200) {
				return response.getBody();
			} 
		}
		RetMsg rMsg = new RetMsg();
		rMsg.setStatus("500");
		rMsg.setMessage("服务器有误，请稍后再试");
		return rMsg;
	}

}
