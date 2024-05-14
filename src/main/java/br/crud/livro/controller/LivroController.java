package br.crud.livro.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//classe controller -> spring busca para fazer requisições
@Controller
public class LivroController {
    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar(){
        return listar();
    }
}
