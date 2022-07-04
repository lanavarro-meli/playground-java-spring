package com.example.aula01.controller;

public class User {
    private int id;
    private String nome;

@Override
    public String toString(){
        return "Ola" + this.id + this.nome;
    }
     //sempre passar o get e set em casos de api
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
