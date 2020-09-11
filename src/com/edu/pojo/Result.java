package com.edu.pojo;

import java.util.List;

public class Result {
	private String score;
	private List face_list;

	public List getFace_list() {
		return face_list;
	}

	public void setFace_list(List face_list) {
		this.face_list = face_list;
	}

	public Result() {
		super();
	}

	public Result(String score) {
		super();
		this.score = score;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Result [score=" + score + "]";
	}
	
	
	
}
