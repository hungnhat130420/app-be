package com.proj1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@RestController
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handleEmployeeNotFoundException (EmployeeNotFoundException ex, WebRequest webRequest) {

        return new ResponseEntity<Object>(new ApiError(ex.getMessage(), HttpStatus.NOT_FOUND, LocalDateTime.now()), HttpStatus.NOT_FOUND);
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Object> handleValidArgument(MethodArgumentNotValidException ex, WebRequest request) {
//        return new ResponseEntity<Object>( createInvalidArgument(), HttpStatus.BAD_REQUEST);
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Map<String, String>> createInvalidArgument(MethodArgumentNotValidException ex, WebRequest webRequest) {
//        Map<String, String> errorMap = new HashMap<>();
//
//        ex.getBindingResult().getFieldErrors().
//                forEach(error -> errorMap.put(error.getField(), error.getDefaultMessage()));
//        return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
//    }

}
