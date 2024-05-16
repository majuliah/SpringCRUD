package br.com.crud.livro.controller;

import java.util.Arrays;
import java.util.List;

import br.crud.livro.entity.Categoria;
import br.crud.livro.entity.Livro;
import br.crud.livro.entity.Modelo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//classe controller -> spring busca para fazer requisições
@Controller
public class LivroController {

    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar() {

        Livro livro1 = new Livro(123L, "Controller - Spring", 1, "Vitor", Categoria.INFORMATICA, Modelo.EBOOK);
        Livro livro2 = new Livro(123L, "Coleções - Boot", 2, "Carlos", Categoria.INFORMATICA, Modelo.EBOOK);
        Livro livro3 = new Livro(123L, "Mapping - Corallis", 3, "Joseph", Categoria.INFORMATICA, Modelo.EBOOK);

        return Arrays.asList(livro1, livro2, livro3);

    }

}