package com.liquors.exception;

public class CustomerException extends RuntimeException {

	private static final long serialVersionUID = -784053624752519573L;

	public CustomerException(String message) {
		super(message);
	}
}
