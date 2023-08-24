package br.edu.ifpb.progdist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSpringController {
    @RequestMapping("/hello")
    public String getHello(){
        return "Oi Pedro Paulo, Seja Bem vindo!";
    }
}
