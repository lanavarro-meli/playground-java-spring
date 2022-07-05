package com.example.aula02.service;

import com.example.aula02.model.Veiculo;
import com.example.aula02.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VeiculoService implements IVeiculoService {
    @Autowired
    private VeiculoRepository repo;
    @Override
    public Veiculo getVeiculo(String placa) {
        return repo.getVeiculo(placa);
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return repo.getAllVeiculo();
    }

    @Override
    public void saveVeiculo(Veiculo novoVeiculo) {
        repo.saveVeiculo(novoVeiculo);
    }
}
