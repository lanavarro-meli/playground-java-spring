package com.example.aula04praticaintegradorai.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EntradaBlog {
    private String id;
    private String blog;
    private String nomeAutor;
    private LocalDateTime dataPublicacao;

}
