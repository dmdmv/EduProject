package com.edu.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.baidu.aip.auth.FaceMatch;
import com.edu.pojo.Msg;
import com.edu.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	@RequestMapping(value="/face",method=RequestMethod.POST)
	@ResponseBody
	public String FaceTest(
			@RequestParam(name="saveImg",required=false) String saveImg
			){
		String faceMatch = FaceMatch.faceMatch(saveImg);
		String score =null;
		ObjectMapper obm = new ObjectMapper();
		try {
			Msg msg = obm.readValue(faceMatch,Msg.class);
			if(msg.getResult()!=null) {
				score=msg.getResult().getScore();
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return score;
		
	}
}
