package com.gmail.christian741.Main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ParamRequiredException extends Exception  {
	private static final long serialVersionUID = 1L;

	public ParamRequiredException(String message) {
		super(message);
	}

}
