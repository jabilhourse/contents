package cn.itcast.ws.jaxws.ws.client;

import cn.itcast.ws.jaxws.ws.WeatherInterfaceImpl;
import cn.itcast.ws.jaxws.ws.WeatherInterfaceImplService;

/**
 * 
 * <p>Title: WeatherClient.java</p>
 * <p>Description:天气查询客户端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月26日上午9:57:40
 * @version 1.0
 */
public class WeatherClient {

	public static void main(String[] args) {
		//创建服务视图
		WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
		//获取服务实现类
		WeatherInterfaceImpl weatherInterfaceImpl = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//调用查询方法，打印
		String weather = weatherInterfaceImpl.queryWeather("北京");
		
		System.out.println(weather);
	}
}
