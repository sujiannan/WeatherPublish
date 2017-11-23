package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.RetMsg;
import com.example.service.WeatherService;

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/{city}")
	public RetMsg getWeather(@PathVariable("city") String city) {
		return weatherService.getWeatherByCity(city);
	}
}
