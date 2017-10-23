package cn.itcast.mobile.server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.itcast.mobile.server.MobileInterface;

/**
 * 
 * <p>
 * Title: MobileServlet.java
 * </p>
 * <p>
 * Description:MobileServlet
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.at
 * @date 2015年11月27日下午4:42:23
 * @version 1.0
 */
public class MobileServlet extends HttpServlet {
	
	private MobileInterface mobileServer;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phoneNum = request.getParameter("phoneNum");
		if(null != phoneNum && !"".equals(phoneNum)){
			ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
			mobileServer = (MobileInterface) context.getBean("mobileServer");
			String result = mobileServer.queryMobile(phoneNum);
			request.setAttribute("result", result);
		}
		request.getRequestDispatcher("/WEB-INF/jsp/queryMobile.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
