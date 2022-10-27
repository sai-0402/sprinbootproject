package com.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.controllerexp.NoSuchEmailException;
@ControllerAdvice
public class EmailExceptionController {
	@ExceptionHandler(value = NoSuchEmailException.class)
	   public ResponseEntity<Object> exception(NoSuchEmailException exception) {
	      return new ResponseEntity<>("Email Not Found!", HttpStatus.NOT_FOUND);
}
}