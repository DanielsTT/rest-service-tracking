package com.example.restservicetracking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ApiError{

    private int  httpCode;
    private HttpStatus httpStatus;
}
