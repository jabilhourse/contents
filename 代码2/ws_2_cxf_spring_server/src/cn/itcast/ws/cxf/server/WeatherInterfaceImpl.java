package cn.itcast.ws.cxf.server;

/**
 * 
 * <p>Title: WeatherInterfaceImpl.java</p>
 * <p>Description:SEI实现类</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日上午9:50:59
 * @version 1.0
 */
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println("from client..."+cityName);
		if("北京".equals(cityName)){
			return "冷且霾";
		} else {
			return "暖且晴";
		}
	}

}
