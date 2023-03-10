package com.gama.livro.service;

import java.util.ArrayList;

import com.gama.livro.model.Livro;

public interface ILivroService {
	public ArrayList<Livro> recuperarTodos();

	public Livro recuperarPorCodigo(int id);

	public Livro cadastrarNovoLivro(Livro livro);
}
