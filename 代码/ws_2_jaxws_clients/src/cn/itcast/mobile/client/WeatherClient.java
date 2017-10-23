package cn.itcast.mobile.client;

import java.util.List;

import cn.itcast.weather.ArrayOfString;
import cn.itcast.weather.WeatherWS;
import cn.itcast.weather.WeatherWSSoap;

/**
 * 
 * <p>Title: WeatherClient.java</p>
 * <p>Description:公网天气查询客户端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月26日下午3:24:12
 * @version 1.0
 */
public class WeatherClient {

	public static void main(String[] args) {
		WeatherWS weatherWS = new WeatherWS();
		WeatherWSSoap weatherWSSoap = weatherWS.getPort(WeatherWSSoap.class);
		ArrayOfString  arrayOfString = weatherWSSoap.getWeather("北京", "");
		List<String> list = arrayOfString.getString();
		
		for(String str : list){
			System.out.println(str);
		}
	}
}
