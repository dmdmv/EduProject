package com.edu.service;

import org.springframework.stereotype.Service;

import com.edu.pojo.User;

@Service
public interface UserService {
	public User findByUsername(String username);
}
