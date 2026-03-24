package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @GetMapping
    public String listar() {
        return "GET funcionando!";
    }

    @PostMapping
    public String criar() {
        return "POST funcionando!";
    }

    @PutMapping
    public String atualizar() {
        return "PUT funcionando!";
    }

    @DeleteMapping
    public String deletar() {
        return "DELETE funcionando!";
    }
}