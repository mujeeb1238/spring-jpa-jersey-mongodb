package com.beee.sample.exception;

public class UserDefinedErrorMessage {

	private String message;
	private String reason;
	private String code;
	private String reasonField;
	
	public UserDefinedErrorMessage(String message, String reason, String code, String reasonField) {
		this.message = message;
		this.reason = reason;
		this.code = code;
		this.reasonField = reasonField;
	}
}
