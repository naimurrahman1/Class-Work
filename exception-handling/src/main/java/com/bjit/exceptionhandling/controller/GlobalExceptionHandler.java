package com.bjit.exceptionhandling.controller;

import com.bjit.exceptionhandling.exception.EmployeeNotFound;
import com.bjit.exceptionhandling.exception.ManagerNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ManagerNotFound.class, EmployeeNotFound.class, ArithmeticException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception ex) {
        if(ex instanceof ManagerNotFound) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } else if(ex instanceof EmployeeNotFound) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
