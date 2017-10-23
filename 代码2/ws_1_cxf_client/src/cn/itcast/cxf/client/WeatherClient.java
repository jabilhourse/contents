package cn.itcast.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import cn.itcast.cxf.weather.WeatherInterface;

/**
 * 
 * <p>Title: WeatherClient.java</p>
 * <p>Description:客户端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日上午10:12:24
 * @version 1.0
 */
public class WeatherClient {

	public static void main(String[] args) {
		//JaxWsProxyFactoryBean调用服务端
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		//设置服务接口
		jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
		//设置服务地址
		jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:12345/weather");
		//获取服务接口实例
		WeatherInterface weatherInterface = jaxWsProxyFactoryBean.create(WeatherInterface.class);
		//调用查询方法
		String weather = weatherInterface.queryWeather("保定");
		System.out.println(weather);
	}
}
