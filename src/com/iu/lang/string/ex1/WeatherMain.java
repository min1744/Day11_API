package com.iu.lang.string.ex1;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherInit wi = new WeatherInit();
		Weather [] weathers = wi.getWethers();
		for(int i = 0; i < weathers.length; i++) {
			System.out.println("도시 : " + weathers[i].getCity());
			System.out.println("상태 : " + weathers[i].getState());
			System.out.println("온도 : " + weathers[i].getTem());
			System.out.println("습도 : " + weathers[i].getHum());
			System.out.println("미세먼지 : " + weathers[i].getMise());
		}
	}
}