package com.example.aula02.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
public class NotFoundExceptionDetails { //padronizacao de excessoes
    private String titulo;
    private int status;
    private String mensagem;
    private LocalDateTime timestamp;

}
