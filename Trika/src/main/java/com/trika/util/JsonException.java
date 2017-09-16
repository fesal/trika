package com.trika.util;

import com.trika.exception.ExceptionType;
import com.trika.exception.JsonBaseException;

public class JsonException extends JsonBaseException{

	private static final long serialVersionUID = 1L;

	private String code;
	
	private String message;
	
	public JsonException(ExceptionType exceptionType, Throwable exception){
		super(exceptionType.getMessage(), exception);
		this.code = exceptionType.getCode();
		this.message = exceptionType.getMessage();
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

	@Override
	public Error getError(String code, String message) {
		// TODO Auto-generated method stub
		return null;
	}

}
