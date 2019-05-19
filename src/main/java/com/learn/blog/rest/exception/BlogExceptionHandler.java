package com.learn.blog.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.learn.blog.rest.JsonHalper.ErrorResponse;

@ControllerAdvice
public class BlogExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleException(BlogEntityNotFoundException exception){		
		ErrorResponse entity = new ErrorResponse(exception.getMessage(), HttpStatus.NOT_FOUND.value());
		
//		ResponseEntity<ErrorResponse> response = new ResponseEntity<>(entity,HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(entity,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorResponse> handleException(Exception exception){
		exception.printStackTrace();
		ErrorResponse entity = new ErrorResponse(exception.getMessage(),HttpStatus.BAD_REQUEST.value());
		
		return new ResponseEntity<>(entity,HttpStatus.BAD_REQUEST);
	}
}
