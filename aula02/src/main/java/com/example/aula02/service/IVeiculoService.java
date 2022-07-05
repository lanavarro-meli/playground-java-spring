package com.example.aula02.service;

import com.example.aula02.dto.VeiculoDto;
import com.example.aula02.model.Veiculo;

import java.util.List;

public interface IVeiculoService {
     VeiculoDto getVeiculo(String placa);
     List<VeiculoDto> getAllVeiculo();

     List<VeiculoDto> getAllOrderByValor();
     List<VeiculoDto> getByModelo(String modelo);
     void saveVeiculo(Veiculo novoVeiculo);
}
