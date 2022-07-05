package com.example.aula02.dto;

import com.example.aula02.model.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class VeiculoDto {
    private String placa;
    private String modelo;
    private double valor;

    public VeiculoDto(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
        this.modelo = veiculo.getModelo();
        this.valor = veiculo.getValor();
    }
}
