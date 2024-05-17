package br.com.crud.livro.controller;

import br.crud.livro.entity.Livro;
import br.crud.livro.repository.LivroRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;

//classe controller -> spring busca para fazer requisições
@RestController
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @RequestMapping("/livros")
    public List<Livro> listar() {
        List<Livro> livros = livroRepository.findAll();
        return livros;
    }

    @Transactional
    @RequestMapping(path = "/livros", method = RequestMethod.POST)
    public void salvar(@RequestBody Livro livro) {

        livroRepository.save(livro);
    }

    @Transactional
    @RequestMapping(path = "/livros", method = RequestMethod.PUT)
    public void atualizar(@RequestBody Livro livro) {
        livroRepository.save(livro);
    }

    @Transactional
    @RequestMapping(path = "/livros/{isbn}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable Long isbn){

        livroRepository.deleteById(isbn);

    }

}