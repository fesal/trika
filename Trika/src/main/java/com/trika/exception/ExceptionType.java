package com.trika.exception;

public enum ExceptionType {

	COULD_NOT_BE_SAVED("500", "Object could not save to database."),
	COULD_NOT_BE_UPDATED("500", "Object could not update to database."),
	COULD_NOT_BE_FIND("500", "Object could not retreive data from database."),
	COULD_NOT_BE_FIND_ALL("500", "List objects could not retreive data from database."),
	COULD_NOT_BE_DELETED("500", "false"),
	COULD_NOT_JSON_CREATED("500","Could not create JSON from object.");
	
	private String code;
	private String message;
	
	private ExceptionType(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
