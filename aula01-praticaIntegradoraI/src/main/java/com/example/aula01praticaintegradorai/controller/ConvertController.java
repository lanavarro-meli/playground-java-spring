package com.example.aula01praticaintegradorai.controller;

import com.example.aula01praticaintegradorai.model.ConverterNumerosDecimalRomano;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ConvertController {

    @GetMapping("/decimalromano/{valor}")
    public String decimalRomano (@PathVariable int valor){
       ConverterNumerosDecimalRomano conversao = new ConverterNumerosDecimalRomano();
       return conversao.converterRomanos(valor);
    }
}
