package com.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.dao.UserDao;
import com.edu.pojo.User;
import com.edu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findByUsername(username);
	}

}
