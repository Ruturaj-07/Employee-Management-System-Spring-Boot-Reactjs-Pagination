package com.usecase.exception;

import java.util.Date;

public class ErrorDeatils {
	private Date timestamp;
	private String message,details;
	
	public ErrorDeatils() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDeatils(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return "ErrorDeatils [timestamp=" + timestamp + ", message=" + message + ", details=" + details + "]";
	}
	
}
