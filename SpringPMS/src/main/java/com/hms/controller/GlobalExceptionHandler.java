//package com.hms.controller;
//
//import com.hms.repository.UserAlreadyExistsException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//public class GlobalExceptionHandler {
//
//@ExceptionHandler(UserAlreadyExistsException.class)
//    public ResponseEntity<String> handleUserAlreadyExists(UserAlreadyExistsException ex) {
//        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
//    }
//}
