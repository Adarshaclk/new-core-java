package com.java.exception.exceptions;

public class RouteNotFoundException extends RuntimeException {
  public RouteNotFoundException(String message) {
    super(message);
  }
}
