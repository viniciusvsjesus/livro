package com.gama.livro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gama.livro.model.Livro;
import com.gama.livro.repository.LivroRepository;

@Component
public class LivroServiceImpl implements ILivroService {

	@Autowired
	private LivroRepository livroRepository;

	@Override
	public ArrayList<Livro> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Livro>) livroRepository.findAll();
	}

	@Override
	public Livro recuperarPorCodigo(int id) {
		// TODO Auto-generated method stub
		return livroRepository.findById(id).orElse(null);
	}

	@Override
	public Livro cadastrarNovoLivro(Livro livro) {
		// TODO Auto-generated method stub
		return livroRepository.save(livro);
	}
	
	
	
	
}
