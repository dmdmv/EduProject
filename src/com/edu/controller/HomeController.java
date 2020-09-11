package com.edu.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edu.service.UserService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;
	
//	@RequestMapping(value="/login",method=RequestMethod.GET)
//	public ModelAndView login(ModelAndView model) {
//		model.setViewName("home/login");
//		return model;
//	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public void login(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
		resp.sendRedirect("../home/login.jsp");
	}
}
