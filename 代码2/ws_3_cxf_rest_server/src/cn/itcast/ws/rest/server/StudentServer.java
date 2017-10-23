package cn.itcast.ws.rest.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.itcast.ws.rest.pojo.Student;

/**
 * 
 * <p>Title: StudentServer.java</p>
 * <p>Description:服务端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日下午3:16:06
 * @version 1.0
 */
public class StudentServer {

	public static void main(String[] args) {
		//JAXRSServerFactoryBean发布REST的服务
		JAXRSServerFactoryBean jaxRSServerFactoryBean = new JAXRSServerFactoryBean();
		
		//设置服务实现类
		jaxRSServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
		//设置资源类，如果有多个资源类，可以以“,”隔开。
		jaxRSServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);
		//设置服务地址
		jaxRSServerFactoryBean.setAddress("http://127.0.0.1:12345/user");
		//发布服务
		jaxRSServerFactoryBean.create();
	}
}
