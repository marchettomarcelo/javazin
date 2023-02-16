package br.com.conta.api.pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PessoaController {
    @GetMapping("/pessoa")
    public Pessoa getPessoa(){
        Pessoa p = new Pessoa("marcelo", "12341234", "marchetto.marcelo@gmail.com");
        return p;
    }
}
