package com.example.aula05.validacao.controller;

import com.example.aula05.validacao.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    public ResponseEntity<UserDTO> saveUser(@RequestBody @Valid UserDTO userDto){
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }

}
