package com.edu.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
	private int id;
	private String username;
	private String phonenum;
	private String email;
	
	
	public User() {
		super();
	}
	public User(int id, String username, String phonenum, String email) {
		super();
		this.id = id;
		this.username = username;
		this.phonenum = phonenum;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", phonenum=" + phonenum + ", email=" + email + "]";
	}
	
	

}
