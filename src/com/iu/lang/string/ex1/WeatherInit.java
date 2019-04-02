package com.iu.lang.string.ex1;

public class WeatherInit {
	private String info;
	
	public WeatherInit() {
		info = "seoul, 맑음, 10, 20, 0.3, daejon, 비, -22, 50, 0.1,"
				+ "incheon, 태풍, 56, 90, 22.2, jeju, 흐림, 15, 10, 1.2";
	}
	
	public Weather [] getWethers() {
		String [] ar = info.split(",");
		Weather[] weathers = new Weather[ar.length/5];
		int index = 0;
		for(int i = 0; i < weathers.length; i++) {
			Weather w = new Weather();
			w.setCity(ar[i].trim());
			w.setState(ar[++i].trim());
			w.setTem(ar[++i].trim());
			w.setHum(ar[++i].trim());
			w.setMise(ar[++i].trim());
			weathers[index] = w;
			index++;
		}
		
		for(int i = 0; i < weathers.length; i += 5) {
			Weather w = new Weather();
			w.setCity(ar[i].trim());
			w.setState(ar[i+1].trim());
			w.setTem(ar[i+2].trim());
			w.setHum(ar[i+3].trim());
			w.setMise(ar[i+4].trim());
			weathers[i/5] = w;
		}
		return weathers;
	}
}