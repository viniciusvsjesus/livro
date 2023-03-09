package com.gama.livro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gama.livro.model.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer>{

}
