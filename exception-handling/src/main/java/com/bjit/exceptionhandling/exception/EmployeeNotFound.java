package com.bjit.exceptionhandling.exception;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(String message) {
        super(message);
    }
}
