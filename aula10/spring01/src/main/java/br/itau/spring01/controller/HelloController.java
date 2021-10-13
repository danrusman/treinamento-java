package br.itau.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica que esta classe é um controller REST
@CrossOrigin("*") // aceita requisições de outros domínios
@RequestMapping("/hello") // nome do recurso

public class HelloController {

    @GetMapping
    public String responder() {
        return "Hello World!\n Meu primeiro projeto Spring!";
    }
    
    @GetMapping("/login")
    public String responder2() {
        return "Bem-vindo!";
    }

}
