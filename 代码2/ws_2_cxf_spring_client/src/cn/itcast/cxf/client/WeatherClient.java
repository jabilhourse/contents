package cn.itcast.cxf.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.cxf.weather.WeatherInterface;

public class WeatherClient {

	public static void main(String[] args) {
		//初始化spring的上下文
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		WeatherInterface  weatherInterface = (WeatherInterface) context.getBean("weatherClient");
		String weather = weatherInterface.queryWeather("保定");
		System.out.println(weather);
	}
}
