package com.bugados.backend.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bugados.backend.dao.TransacaoDAO;
import com.bugados.backend.model.Transacao;

@CrossOrigin(origins = "*")
@RestController
public class TransacaoController {
	@Autowired //injeção da dependência - não precisa implementar pois o framework cria
	private TransacaoDAO dao;
	
	@GetMapping("/transacoes")
	public ArrayList<Transacao> listarTudo(){
		ArrayList<Transacao> lista = (ArrayList<Transacao>) dao.findAll();
		
		return lista;
	}
}


