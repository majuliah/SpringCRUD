package br.crud.livro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity //informa que uma classe também é uma entidade
@Getter //gera os getters da classe
@ToString //gera atributos a partir do toString
@NoArgsConstructor //default para ctor vazio
@AllArgsConstructor //ctor com argumentos
public class Livro {
    @Id
    private Long isbn;
    private String titulo;
    private Integer edicao;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @Enumerated(EnumType.STRING)
    private Modelo modelo;

}