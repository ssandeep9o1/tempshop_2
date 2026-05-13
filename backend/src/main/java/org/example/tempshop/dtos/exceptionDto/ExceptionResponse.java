package org.example.tempshop.dtos.exceptionDto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class ExceptionResponse {
    private String message;

    private HttpStatus status;

    private LocalDateTime dateTime;
}
