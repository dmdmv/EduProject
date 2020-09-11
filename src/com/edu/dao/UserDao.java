package com.edu.dao;

import com.edu.pojo.User;

public interface UserDao {
	public User findByUsername(String username);
	
}
