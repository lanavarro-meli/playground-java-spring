package com.example.aula02.service;

import com.example.aula02.dto.VeiculoDto;
import com.example.aula02.model.Veiculo;
import com.example.aula02.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoService implements IVeiculoService {
    @Autowired
    private VeiculoRepository repo;
    @Override
    public VeiculoDto getVeiculo(String placa) {
        VeiculoDto veiculoDto = new VeiculoDto(repo.getVeiculo(placa));
        return veiculoDto;
    }

    @Override
    public List<VeiculoDto> getAllVeiculo() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        List<VeiculoDto> listaDto= listaVeiculos.stream().map( v-> new VeiculoDto(v)).collect(Collectors.toList());
        return listaDto;
    }

    @Override
    public List<VeiculoDto> getAllOrderByValor() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        List<VeiculoDto> listaDto= listaVeiculos
                .stream()
                .sorted((x,y) -> Double.compare(x.getValor(),y.getValor()))
                .map( v-> new VeiculoDto(v))
                .collect(Collectors.toList());
        return listaDto;
    }

    @Override
    public List<VeiculoDto> getByModelo(String modelo) {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        List<VeiculoDto> listaDto= listaVeiculos
                .stream()
                .filter( x -> x.getModelo().equals(modelo))
//                .sorted((x,y) -> Double.compare(x.getValor(),y.getValor()))
                .map(VeiculoDto:: new)
                .collect(Collectors.toList());
        return listaDto;
    }

    @Override
    public void saveVeiculo(Veiculo novoVeiculo) {
        repo.saveVeiculo(novoVeiculo);
    }
}
