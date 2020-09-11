package com.edu.pojo;

public class Msg {
	private int error_code;
	private String error_msg;
	private Long log_id;
	private Long timestamp;
	private int cached;
	private Result result;
	
	
	public Msg() {
		super();
	}
	public Msg(int error_code, String error_msg, Long log_id, Long timestamp, int cached, Result result) {
		super();
		this.error_code = error_code;
		this.error_msg = error_msg;
		this.log_id = log_id;
		this.timestamp = timestamp;
		this.cached = cached;
		this.result = result;
	}
	public int getError_code() {
		return error_code;
	}
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public Long getLog_id() {
		return log_id;
	}
	public void setLog_id(Long log_id) {
		this.log_id = log_id;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public int getCached() {
		return cached;
	}
	public void setCached(int cached) {
		this.cached = cached;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Msg [error_code=" + error_code + ", error_msg=" + error_msg + ", log_id=" + log_id + ", timestamp="
				+ timestamp + ", cached=" + cached + ", result=" + result + "]";
	}
	
	

}
