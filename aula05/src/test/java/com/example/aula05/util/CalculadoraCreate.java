package com.example.aula05.util;

import com.example.aula05.calculadora.Calculadora;
import lombok.Data;

@Data
public class CalculadoraCreate {
    private double a = 4,b = 2;
    public static Calculadora create() {
       return new Calculadora(4,2);
    }
}
