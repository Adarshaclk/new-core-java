package com.java.exception.exceptions;

public class InvaliedEmailFormateException extends RuntimeException {
    public InvaliedEmailFormateException(String message) {
        super(message);
    }
}
