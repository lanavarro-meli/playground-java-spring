package com.example.aula05.calculadora;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculadora {
    private double a,b;
    public double Dividir(){
        if(b == 0){
            return -1;
        }
        return a/b;

    }
}
