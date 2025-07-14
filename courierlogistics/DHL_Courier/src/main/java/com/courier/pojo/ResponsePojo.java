package com.courier.pojo;

public class ResponsePojo {

	private Integer responseCode;
	private String responseMessage;
	
	public ResponsePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponsePojo(Integer responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	
}
