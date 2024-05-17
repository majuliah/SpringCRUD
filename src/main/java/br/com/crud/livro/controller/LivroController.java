package br.com.crud.livro.controller;

import java.util.Arrays;
import java.util.List;



import br.crud.livro.entity.Categoria;
import br.crud.livro.entity.Livro;
import br.crud.livro.entity.Modelo;
import br.crud.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//classe controller -> spring busca para fazer requisições
@Controller
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @ResponseBody
    @RequestMapping("/livros")
    public List<Livro> listar() {
        List<Livro> livros = livroRepository.findAll();
        return livros;
    }

    @ResponseBody
    @Transactional
    @RequestMapping(path = "/livros", method = RequestMethod.POST)
    public void salvar(@RequestBody Livro livro) {

        livroRepository.save(livro);
    }

}