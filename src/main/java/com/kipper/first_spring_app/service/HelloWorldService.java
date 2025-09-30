package com.kipper.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service // indica que a classe é um serviço do Spring
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello World " + name;
    }
}
