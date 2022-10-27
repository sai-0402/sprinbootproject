package com.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.controllerexp.NoSuchDeptException;

@ControllerAdvice
public class DeptExceptionController {
	 @ExceptionHandler(value = NoSuchDeptException.class)
	   public ResponseEntity<Object> exception(NoSuchDeptException exception) {
	      return new ResponseEntity<>("Dept Not Found!", HttpStatus.NOT_FOUND);
}
}
