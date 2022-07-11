package com.example.aula05.calculadora;

import com.example.aula05.util.CalculadoraCreate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {


    private static Calculadora calculadora;
    @BeforeEach
    public static void setup(){
         calculadora = CalculadoraCreate.create();
    }


    @Test
    @DisplayName("Valida Parametros diferentes de zero")
    void dividir_returnValueDouble_WhenParamDifferentsZero() {
        //nao escreva if dentro do teste
        //cada teste é unico - uma situacao


        double expected = CalculadoraCreate.create().getA() / CalculadoraCreate.create().getB();
        double resultado = calculadora.Dividir();
        Assertions.assertEquals(expected, resultado);
    }

    @Test
    @DisplayName("Valida Parametros com denominador zero")
    void dividir_returnZero_WhenParamZero() {
        //nao escreva if dentro do teste
        //cada teste é unico - uma situacao

        double expected = 0;
        calculadora.setB(0);
        double resultado = calculadora.Dividir();
        Assertions.assertEquals(expected, resultado);
    }
}