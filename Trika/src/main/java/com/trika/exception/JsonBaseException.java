package com.trika.exception;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class JsonBaseException extends JsonProcessingException{

	private static final long serialVersionUID = 1L;

	public abstract Error getError(String code, String message);

	protected JsonBaseException(String msg, Throwable rootCause) {
		super(msg, rootCause);
	}

	protected class Error {

		private String code;
		private String message;

		public Error(String code, String message) {
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
}
