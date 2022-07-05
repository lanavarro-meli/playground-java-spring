package com.example.aula02.handler;

import com.example.aula02.exception.NotFoundException;
import com.example.aula02.exception.NotFoundExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class NotFoundExHandler { //handler comporta qualquer tipo de excessao
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionDetails> handlerNotFoundEx(NotFoundException ex){
        return new ResponseEntity<>(
                NotFoundExceptionDetails.builder()
                        .titulo("Objeto não encontrado")
//                        .status(HttpStatus.NOT_FOUND.value())
                        .mensagem(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build()
                ,HttpStatus.NOT_FOUND);
    }
}
