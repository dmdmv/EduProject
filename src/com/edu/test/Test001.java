package com.edu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.pojo.User;
import com.edu.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/applicationContext.xml"})
public class Test001 {
	@Autowired
	private UserService test;
	@Test
	public void test1()
	{
		User findByUsername = test.findByUsername("admin");
		System.out.println(findByUsername);
	}
}
