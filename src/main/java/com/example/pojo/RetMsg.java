package com.example.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 返回消息
 * @author SUJiannan
 * @since 1.0 2017年11月23日
 * @see 下午7:45:52
 * API： http://www.sojson.com/open/api/weather/json.shtml?city=%E5%8C%97%E4%BA%AC
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetMsg implements Serializable{

	private String date;
	private String message;
	private String status;
	private String city;
	private String count;
	private Data data;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
}
