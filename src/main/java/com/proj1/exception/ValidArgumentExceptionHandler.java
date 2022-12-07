//package com.proj1.exception;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//import java.util.Date;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@ControllerAdvice
//public class ValidArgumentExceptionHandler extends ResponseEntityExceptionHandler {
////    @ResponseStatus(HttpStatus.CONFLICT)
////    @ExceptionHandler(MethodArgumentNotValidException.class)
////    public  Map<String, String> handleArgumentNotValid(MethodArgumentNotValidException ex) {
////        Map<String, String> errorMap = new HashMap<>();
////
////        ex.getBindingResult().getFieldErrors().
////                forEach(error -> {
////                    errorMap.put(error.getField(), error.getDefaultMessage());
////                });
////        return errorMap;
////    }
//
////    @ExceptionHandler(MethodArgumentNotValidException.class)
////    public ResponseEntity<Object> handleValidArgument(MethodArgumentNotValidException ex) {
////        FieldError fieldError = new FieldError();
////        ex.getBindingResult().getFieldErrors().
////                forEach(error -> {
////                    fieldError.setField(error.getField());
////                    fieldError.setMessage(error.getDefaultMessage());
////                });
////        return new ResponseEntity<Object>(fieldError, HttpStatus.CONFLICT);
////    }
//
//
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        Map<String, Object> body = new LinkedHashMap<>();
//        body.put("timestamp", new Date());
//        body.put("status", status.value());
//
//        //Get all errors
//        List<String> errors = ex.getBindingResult()
//                .getFieldErrors()
//                .stream()
//                .map(x -> x.getDefaultMessage())
//                .collect(Collectors.toList());
//
//        body.put("errors", errors);
//
//        return new ResponseEntity<>(body, headers, status);
//    }
//}
