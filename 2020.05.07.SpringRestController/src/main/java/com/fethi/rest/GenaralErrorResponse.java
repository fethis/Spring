package com.fethi.rest;

public class GenaralErrorResponse {

	private int status;

	private String message;

	public GenaralErrorResponse() {
		super();

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
