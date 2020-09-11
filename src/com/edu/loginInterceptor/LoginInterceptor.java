package com.edu.loginInterceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String requestURI = request.getRequestURI();
		Object admin = request.getSession().getAttribute("admin");
	
		if(admin==null) {
			System.out.println("链接"+requestURI+"进入拦截器");
			String headerv = request.getHeader("X-Requested-With");
			//判断是否是Ajax请求
			if("X-Requested-With".equals(headerv)){
				//表示是Ajax请求
				Map<String, String> ret = new HashMap<String, String>();
				ret.put("type","error");
				ret.put("msg","登录会话超时或还未登录，请重新登录");
				//JSONObject.fromObject(ret)将Java对象转化成json对象
				response.getWriter().write(JSONObject.fromObject(ret).toString());
				return false;
			}
			//表示是普通链接跳转，直接冲顶向到登录页面
			response.sendRedirect(request.getServletContext().getContextPath()+"/system/login");
			
			return false;
		}
		return true;
	}

}
