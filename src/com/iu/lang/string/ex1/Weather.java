package com.iu.lang.string.ex1;

public class Weather {
	//도시
	//맑음
	//온도
	//습도
	//미세먼지
	private String city;
	private String state;
	private String tem;
	private String hum;
	private String mise;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTem() {
		return tem;
	}
	public void setTem(String tem) {
		this.tem = tem;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}
	public String getMise() {
		return mise;
	}
	public void setMise(String mise) {
		this.mise = mise;
	}
}