package com.learn.blog.rest.exception;

public class BlogEntityNotFoundException extends RuntimeException {

	public BlogEntityNotFoundException() {
		super();
	}

	public BlogEntityNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BlogEntityNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlogEntityNotFoundException(String message) {
		super(message);
	}

	public BlogEntityNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
