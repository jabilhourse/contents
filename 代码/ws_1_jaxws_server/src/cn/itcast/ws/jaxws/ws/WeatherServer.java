package cn.itcast.ws.jaxws.ws;

import javax.xml.ws.Endpoint;

/**
 * 
 * <p>Title: WeatherServer.java</p>
 * <p>Description:天气服务端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月26日上午9:41:20
 * @version 1.0
 */
public class WeatherServer {

	public static void main(String[] args) {
		//Endpoint发布服务
		//参数解释
		//1.address - 服务地址
		//2.implementor - 实现类
		Endpoint.publish("http://127.0.0.1:12345/weather", new WeatherInterfaceImpl());
	}
}
