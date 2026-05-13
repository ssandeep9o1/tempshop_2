package org.example.tempshop.exceptions;


import org.example.tempshop.dtos.exceptionDto.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;


@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleCategoryNotFound(CategoryNotFoundException e){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setMessage(e.getMessage());
        exceptionResponse.setStatus(HttpStatus.NOT_FOUND);
        exceptionResponse.setDateTime(LocalDateTime.now());

        return (ResponseEntity<ExceptionResponse>) ResponseEntity.notFound();

    }

    @ExceptionHandler(InvalidCategoryId.class)
    public ResponseEntity<ExceptionResponse> handleInvalidIdException(InvalidCategoryId e){
        ExceptionResponse exceptionResponse = new ExceptionResponse();

        exceptionResponse.setMessage(e.getMessage());
        exceptionResponse.setStatus(HttpStatus.BAD_REQUEST);
        exceptionResponse.setDateTime(LocalDateTime.now());

        return (ResponseEntity<ExceptionResponse>) ResponseEntity.badRequest();
    }
}
