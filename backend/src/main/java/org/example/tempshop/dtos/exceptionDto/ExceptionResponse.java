package org.example.tempshop.dtos.exceptionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {
    private String message;

    private HttpStatus status;

    private LocalDateTime dateTime;
}
