package com.fethi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GeneralExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<GenaralErrorResponse> hataYakala(Exception exc) {

		GenaralErrorResponse hata = new GenaralErrorResponse();

		hata.setStatus(HttpStatus.BAD_REQUEST.value());
		hata.setMessage(exc.getMessage());

		return new ResponseEntity<>(hata, HttpStatus.BAD_REQUEST);

	}

}
