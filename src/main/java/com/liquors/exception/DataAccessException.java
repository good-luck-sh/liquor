package com.liquors.exception;

public class DataAccessException extends RuntimeException {

	private static final long serialVersionUID = 36160919392358319L;

	public DataAccessException(String message) {
		super(message);
	}
}
