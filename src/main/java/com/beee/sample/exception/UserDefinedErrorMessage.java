package com.beee.sample.exception;

public final class UserDefinedErrorMessage {

	private String message;
	private String reason;
	private String code;
	private String reasonField;
	
	public UserDefinedErrorMessage(String message, String reason, String code, String reasonField) {
		this.setMessage(message);
		this.setReason(reason);
		this.setCode(code);
		this.setReasonField(reasonField);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getReasonField() {
		return reasonField;
	}

	public void setReasonField(String reasonField) {
		this.reasonField = reasonField;
	}
	
}
