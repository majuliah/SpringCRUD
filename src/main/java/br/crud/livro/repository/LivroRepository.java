package br.crud.livro.repository;

import br.crud.livro.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//logica de acesso a dados
public interface LivroRepository extends JpaRepository<Livro, Long>{

}