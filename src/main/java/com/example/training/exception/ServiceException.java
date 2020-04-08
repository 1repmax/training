package com.example.training.exception;

public class ServiceException extends RuntimeException {

    private static final Long serialVersionUID = 1L;

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
