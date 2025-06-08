package com.java.exception.exceptions;

public class NoWifiConnectionException extends RuntimeException {
    public NoWifiConnectionException(String message) {
        super(message);
    }
}
