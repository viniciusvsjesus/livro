package com.gama.livro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gama.livro.model.Livro;
import com.gama.livro.service.ILivroService;

@RestController
public class LivroController {

	@Autowired
	private ILivroService service;
	
	@GetMapping("/livros")
	public ArrayList<Livro> listarTodos(){
		return service.recuperarTodos();
	}
	
	@GetMapping("/livros/{id}")
	public ResponseEntity<Livro> buscarPeloId(@PathVariable int id){
		Livro livro = service.recuperarPorCodigo(id); 
		if(livro != null) {
			return ResponseEntity.ok().body(livro);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/livros")
	public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro){
		Livro livroCadastrado =service.cadastrarNovoLivro(livro);
		if(livro != null) {
			return ResponseEntity.status(201).body(livroCadastrado);
		}
		return ResponseEntity.badRequest().build();
	}
	
	
}
