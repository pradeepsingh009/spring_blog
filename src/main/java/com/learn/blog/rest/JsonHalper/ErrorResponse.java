package com.learn.blog.rest.JsonHalper;

public class ErrorResponse {
	
	private String errorMsg;	
	private int status;
	
	public ErrorResponse() {
		
	}
	public ErrorResponse(String errorMsg,int status) {
		this.errorMsg = errorMsg;
		this.status = status;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	

}
