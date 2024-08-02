package com.prod.features.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class APIError {

    private LocalDateTime timestamp;
    private String errorMessage;
    private HttpStatus statusCode;

    public APIError() {
        this.timestamp = LocalDateTime.now();
    }

    public APIError(String errorMessage, HttpStatus statusCode) {
        this();
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }
}
