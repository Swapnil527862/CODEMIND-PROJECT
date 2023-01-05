package com.codemind.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.*;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String message) {
		
		super(message);
		
	}

}
