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
			System.out.println("����"+requestURI+"����������");
			String headerv = request.getHeader("X-Requested-With");
			//�ж��Ƿ���Ajax����
			if("X-Requested-With".equals(headerv)){
				//��ʾ��Ajax����
				Map<String, String> ret = new HashMap<String, String>();
				ret.put("type","error");
				ret.put("msg","��¼�Ự��ʱ��δ��¼�������µ�¼");
				//JSONObject.fromObject(ret)��Java����ת����json����
				response.getWriter().write(JSONObject.fromObject(ret).toString());
				return false;
			}
			//��ʾ����ͨ������ת��ֱ�ӳ嶥�򵽵�¼ҳ��
			response.sendRedirect(request.getServletContext().getContextPath()+"/system/login");
			
			return false;
		}
		return true;
	}

}
