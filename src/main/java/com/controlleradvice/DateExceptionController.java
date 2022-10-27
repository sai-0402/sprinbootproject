package com.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.controllerexp.NoSuchDateException;

@ControllerAdvice
public class DateExceptionController {
	 @ExceptionHandler(value = NoSuchDateException.class)
	   public ResponseEntity<Object> exception(NoSuchDateException exception) {
	      return new ResponseEntity<>("Date Not Found!", HttpStatus.NOT_FOUND);
}
}
