package com.kipper.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kipper.first_spring_app.service.HelloWorldService;

@RestController // indica que a classe é um controlador REST
@RequestMapping("/hello-world") // cria um endpoint(caminho) para acessar o método helloWorld
public class HellowWorldController {

    @Autowired // indica que o Spring deve injetar a dependência do serviço HelloWorldService
    private HelloWorldService helloWorldService;

    @GetMapping // mapeia requisicoes do tipo GET para o metodo helloWorld
    public String helloWorld(){
        return helloWorldService.helloWorld("Kipper");
    }
}
