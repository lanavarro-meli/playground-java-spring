package com.example.aula05.validacao.exceptions;

import lombok.Builder;

import java.time.LocalDateTime;
@Builder
public class ValidationExceptionDetails {
    private String title;
    private String message;
    private String fields;
    private String fieldsMessages;
    private LocalDateTime timestamp;


}
