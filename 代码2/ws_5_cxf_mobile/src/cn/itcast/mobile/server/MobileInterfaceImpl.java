package cn.itcast.mobile.server;

import cn.itcast.mobile.MobileCodeWSSoap;

public class MobileInterfaceImpl implements MobileInterface {

	private MobileCodeWSSoap mobileClient;
	
	@Override
	public String queryMobile(String phoneNum) {
		return mobileClient.getMobileCodeInfo(phoneNum, "");
	}

	public MobileCodeWSSoap getMobileClient() {
		return mobileClient;
	}

	public void setMobileClient(MobileCodeWSSoap mobileClient) {
		this.mobileClient = mobileClient;
	}

}
