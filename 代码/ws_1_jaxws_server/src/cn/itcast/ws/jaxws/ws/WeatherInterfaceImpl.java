package cn.itcast.ws.jaxws.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 
 * <p>Title: WeatherInterfaceImpl.java</p>
 * <p>Description:SEI实现类</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月26日上午9:29:27
 * @version 1.0
 */
@WebService(
		targetNamespace="http://service.cn.itcast",
		name="WeatherWSSoap",
		portName="WeatherWSSoapPort",
		serviceName="WeatherWS"
		)//@WebService表示该类是一个服务类，需要发布其中的public的方法
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherInterfaceImpl implements WeatherInterface {

	@WebMethod(
			operationName="getWeather",
			exclude=false
			)
	@Override
	public @WebResult(name="result")String queryWeather(@WebParam(name="cityName")String cityName) {
		System.out.println("from client..."+cityName);
		String weather = "晴";
		return weather;
	}

}
