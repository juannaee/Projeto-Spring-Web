
package com.projetospringweb.SpringWeb1.exceptions;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleResourceNotException(ResourceNotFoundException ex) {

		Map<String, Object> responseBody = new HashMap<>();
		responseBody.put("status", HttpStatus.NOT_FOUND.value());
		responseBody.put("error", HttpStatus.NOT_FOUND.getReasonPhrase());
		responseBody.put("message", ex.getMessage());
		responseBody.put("timestamp", new Date());

		return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);

	}

}
