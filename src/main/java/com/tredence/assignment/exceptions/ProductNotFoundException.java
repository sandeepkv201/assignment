package com.tredence.assignment.exceptions;

/**
 * Throw ProductNotFoundException when product list is empty for any scenario.
 */
public class ProductNotFoundException extends NotFoundException {

    public ProductNotFoundException() {
        super();
    }

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductNotFoundException(Throwable cause) {
        super(cause);
    }
}
