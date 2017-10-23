package cn.itcast.ws.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.apache.cxf.tools.java2wsdl.processor.internal.jaxws.generator.JaxwsServerGenerator;

/**
 * 
 * <p>Title: WeatherServer.java</p>
 * <p>Description:服务端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日上午9:51:36
 * @version 1.0
 */
public class WeatherServer {

	public static void main(String[] args) {
		//JaxWsServerFactoryBean发布服务
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		//设置服务接口
		jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
		//设置服务实现类
		jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl());
		//设置服务地址
		jaxWsServerFactoryBean.setAddress("http://127.0.0.1:12345/weather");
		
		//加入拦截器
		jaxWsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		jaxWsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		
		//发布
		jaxWsServerFactoryBean.create();
	}
}
