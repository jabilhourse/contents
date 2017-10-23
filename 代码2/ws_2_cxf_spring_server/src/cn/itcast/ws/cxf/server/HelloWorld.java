package cn.itcast.ws.cxf.server;

import javax.jws.WebService;

/**
 * 
 * <p>Title: HelloWorld.java</p>
 * <p>Description:简单类</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日上午11:11:10
 * @version 1.0
 */
@WebService
public class HelloWorld {
	public String sayHello(String name){
		return "hello,"+name;
	}
	
}
