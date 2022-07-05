package com.example.aula02.repository;

import com.example.aula02.exception.NotFoundException;
import com.example.aula02.exception.NotFoundExceptionDetails;
import com.example.aula02.model.Veiculo;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepository {
    private final String filepath = "src/main/resources/dados.json";

    public Veiculo getVeiculo(String placa) {
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> lista = null;
        File f = new File(filepath);

        try {

            lista = Arrays.asList
                    (mapper.readValue(new File(filepath), Veiculo[].class));
            for (Veiculo v : lista) {
                if (v.getPlaca().equals(placa)) {
                    return v;
                }
            }
        } catch (Exception e) {

        }
        throw new NotFoundException("Veículo não encontrado");

    }

    public List<Veiculo> getAllVeiculo() {
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> lista = null;
        try {
            lista = Arrays.asList(mapper.readValue(new File(filepath), Veiculo[].class));
        } catch (Exception e) {

        }
        return lista;

    }

    public void saveVeiculo(Veiculo novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<Veiculo> listaAtual = null;
        List<Veiculo> listaNova = null;

        try {
            listaAtual = Arrays.asList(mapper.readValue(new File(filepath), Veiculo[].class));
            listaNova = new ArrayList<>(listaAtual);
            listaAtual.add(novoVeiculo);
            writer.writeValue(new File(filepath),listaNova);
        } catch (Exception e) {
            System.out.println("erro");
        }
    }
}



