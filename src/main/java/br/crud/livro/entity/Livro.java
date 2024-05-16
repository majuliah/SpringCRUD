package br.crud.livro.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter //gera os getters da classe
@ToString //gera atributos a partir do toString
@AllArgsConstructor //ctor com argumentos
public class Livro {

    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;
    private Categoria categoria;
    private Modelo modelo;

}