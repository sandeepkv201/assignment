package com.tredence.assignment.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tredence.assignment.exceptions.NotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {

        HttpStatus status;

        if (ex instanceof NotFoundException) {
            // Setting 400 Http Status for exceptions of type NotFoundException.
            status = HttpStatus.NOT_FOUND;
        } else {
            // Setting default status code to 500 for all other exceptions
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return ResponseEntity.status(status).body(ex.getMessage());
    }
}
