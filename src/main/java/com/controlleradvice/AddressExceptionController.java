package com.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.controllerexp.NoSuchAddressException;
@ControllerAdvice
public class AddressExceptionController {
	 @ExceptionHandler(value = NoSuchAddressException.class)
	   public ResponseEntity<Object> exception(NoSuchAddressException exception) {
	      return new ResponseEntity<>("Address Not Found!", HttpStatus.NOT_FOUND);
}

}
