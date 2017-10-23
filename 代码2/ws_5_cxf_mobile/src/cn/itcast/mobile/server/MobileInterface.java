package cn.itcast.mobile.server;

import javax.jws.WebService;

/**
 * 
 * <p>Title: MobileInterface.java</p>
 * <p>Description:SEI接口</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月27日下午4:21:24
 * @version 1.0
 */
@WebService
public interface MobileInterface {

	public String queryMobile(String phoneNum);
}
