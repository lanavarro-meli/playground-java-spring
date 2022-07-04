package com.example.aula01.controller;

import com.example.aula01.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //indica que essa classe é um controller rest
@RequestMapping("/user") //indica que e usado para acionar esse controller -- rota
public class Hello {

    @GetMapping("/ola/{nome}") //esse metodo e acionado por uma resquisicao get
    public String sayHello(@PathVariable String nome){
        return "Olá mundo!" + nome;
    }
    @GetMapping("/ola") //esse metodo e acionado por uma resquisicao get
    public String sayHello2(@RequestParam String nome){
        return "Olá mundo!" + nome;
    }

    @PostMapping //esse metodo e acionado por uma resquisicao get
    public ResponseEntity<UserDto> user(@RequestBody User user){
        if(user.getId() == 123){
            UserDto userDto = new UserDto(user);
            return new ResponseEntity(userDto, HttpStatus.OK);
        }
        else {
            return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
        }

    }
}
