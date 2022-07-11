package com.example.aula05.validacao.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class UserDTO {
    @NotBlank(message = "O nome é um campo obrigatório")
    private String name;
    @Email
    @NotBlank(message=" O email é obrigatório")
    private String email;
    @Min(value = 18, message = "A idade mínima é 18 anos")
    private int idade;

}
