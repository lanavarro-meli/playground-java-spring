package com.example.aula04praticaintegradorai.repository;

import com.example.aula04praticaintegradorai.dto.EntradaBlogDto;
import com.example.aula04praticaintegradorai.model.EntradaBlog;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import org.springframework.stereotype.Repository;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

@Repository
public class EntradaBlogRepository {
    private final String filepath = "src/main/resources/entradaBlog.json";

    public void saveBlog(EntradaBlog blog){
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        List<EntradaBlog> listablog = null;
        List<EntradaBlog> listablognova = null;

        try{
            listablog = Arrays.asList(mapper.readValue(new File(filepath), EntradaBlog[].class));
            listablognova = new ArrayList<>(listablog);
            listablognova.add(blog);
            writer.writeValue(new File(filepath),listablognova);
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }

    }

    public List<EntradaBlogDto> getAllBlog(){
       ObjectMapper mapper = new ObjectMapper();
       List<EntradaBlogDto> lista = null;
       try{
           lista = Arrays.asList(mapper.readValue(new File(filepath), EntradaBlogDto[].class));
       }
       catch(Exception e){

        }
       return lista;
    }

    public EntradaBlog getBlog(String id) {
        ObjectMapper mapper = new ObjectMapper();
        List<EntradaBlog> lista = null;
        try{
            lista = Arrays.asList(mapper.readValue(new File(filepath),EntradaBlog[].class));
            for(EntradaBlog e : lista){
                if(e.getId().equals(id)){
                    return e;
                }
            }
        }
        catch(Exception e){

        }
        return null;
    }



}
