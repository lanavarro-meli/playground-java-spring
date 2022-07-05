package com.example.aula02.service;

import com.example.aula02.model.Veiculo;

import java.util.List;

public interface IVeiculoService {
     Veiculo getVeiculo(String placa);
     List<Veiculo> getAllVeiculo();
     void saveVeiculo(Veiculo novoVeiculo);
}
