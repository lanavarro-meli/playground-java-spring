package com.example.aula01.dto;

import com.example.aula01.controller.User;
import com.example.aula01.controller.User;

public class UserDto {
    private String nome;

    public UserDto(User user){
        this.nome = user.getNome();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
