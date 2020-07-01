package com.example.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.projeto.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario,Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfOrEmail (String entrada, String senha);
}