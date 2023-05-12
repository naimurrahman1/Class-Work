package com.bjit.exceptionhandling.exception;

public class ManagerNotFound extends RuntimeException {
    public ManagerNotFound(String message) {
        super(message);
    }

}
