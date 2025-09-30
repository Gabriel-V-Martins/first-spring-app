package com.kipper.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que a classe é um controlador REST
@RequestMapping("/hello-world") // cria um endpoint(caminho) para acessar o método helloWorld
public class HellowWorldController {

    @GetMapping // mapeia requisicoes do tipo GET para o metodo helloWorld
    public String helloWorld(){
        return "Hello World!";
    }
}
