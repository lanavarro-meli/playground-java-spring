package com.example.aula04praticaintegradorai.dto;

import com.example.aula04praticaintegradorai.model.EntradaBlog;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor

public class EntradaBlogDto {
    private String blog;
    private String nomeAutor;
    private LocalDateTime dataPublicacao;

    public EntradaBlogDto(EntradaBlog entradaBlog){
        this.blog = entradaBlog.getBlog();
        this.nomeAutor = entradaBlog.getNomeAutor();
        this.dataPublicacao = entradaBlog.getDataPublicacao();
    }
}
