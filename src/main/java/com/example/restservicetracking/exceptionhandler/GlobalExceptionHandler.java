package com.example.restservicetracking.exceptionhandler;

import com.example.restservicetracking.model.ApiError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.format.DateTimeParseException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DateTimeParseException.class)
    public ResponseEntity<ApiError> handle(DateTimeParseException e) {
        return ResponseEntity.badRequest().body(new ApiError(e.getMessage()));
    }
}