package cn.itcast.mobile.client;

import cn.itcast.mobile.MobileCodeWS;
import cn.itcast.mobile.MobileCodeWSSoap;

/**
 * 
 * <p>Title: MobileClient.java</p>
 * <p>Description:公网手机号查询客户端</p>
 * <p>Company: www.itcast.com</p>
 * @author  传智.at
 * @date    2015年11月26日下午3:16:05
 * @version 1.0
 */
public class MobileClient {

	public static void main(String[] args) {
		//创建服务视图
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		//获取服务实现类
		MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		//调用查询方法
		String reuslt = mobileCodeWSSoap.getMobileCodeInfo("13888888", null);
		System.out.println(reuslt);
	}
}
