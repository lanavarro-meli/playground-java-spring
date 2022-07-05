package com.example.aula02.service;

import com.example.aula02.dto.VeiculoDto;
import com.example.aula02.model.Veiculo;

import java.util.List;

public interface IVeiculoService {
     VeiculoDto getVeiculo(String placa);
     List<VeiculoDto> getAllVeiculo();
     void saveVeiculo(Veiculo novoVeiculo);
}
