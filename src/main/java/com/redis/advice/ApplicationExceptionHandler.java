package com.redis.advice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    public ResponseEntity<Object> handleMethodArgumentNotValidException(
	    		MethodArgumentNotValidException ex, WebRequest request) {

	        Map<String, Object> errors = new LinkedHashMap<>();
	        errors.put("timestamp", LocalDateTime.now());
	        errors.put("errorCode","E4001");
	        ex.getBindingResult().getAllErrors().forEach((error)->{
	        	String fieldName = ((FieldError) error).getField();
	        	String message = error.getDefaultMessage();
	        	errors.put(fieldName, message);
	        });

	        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	    }
	
}
