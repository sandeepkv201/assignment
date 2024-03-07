package com.tredence.assignment.exceptions;

/**
 * Create custom exceptions extending NotFoundException for cases we want to
 * return Http Status 400.
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException() {
        super();
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
