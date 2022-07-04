package com.example.aula01praticaintegradorai.model;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class ConverterNumerosDecimalRomano implements IConverterNumerosDecimalRomano {
    private static final int [] valores = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String [] romanos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    @Override
    public String converterRomanos(int valor) {
        StringBuilder resultado = new StringBuilder();
        for(int i=0; i< valores.length; i++){
            int parteInteira = valor/ valores[i];
            valor -= valores[i] * parteInteira;
            resultado.append(join("",nCopies(parteInteira,romanos[i])));
        }
        return resultado.toString();
    }
}
