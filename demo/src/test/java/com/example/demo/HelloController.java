package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que esta classe é um controlador REST
public class HelloController {

    @GetMapping("/hello") // Mapeia a URL /hello
    public String hello() {
        return "Olá, mundo! Este é o backend funcionando!";
    }
}
