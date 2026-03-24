package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
/*import com.example.demo.Contato;*/

@RestController
@RequestMapping("/contato")
public class ContatoController {
    List<Contato> contatos = new ArrayList<Contato>();
    
    @PostMapping
    public String criar(@RequestBody Contato contato) {
        contatos.add(contato);
        return "Contato criado com sucesso!";
    }

    @GetMapping
    public List<Contato> listar() {
        return contatos;
    }
    

    @PutMapping
    public String atualizar() {
        return "Contato atualizado com sucesso!";
    }

    @DeleteMapping
    public String deletar() {
        return "Contato deletado com sucesso!";
    }
}