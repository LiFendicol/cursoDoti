package com.example.projeto.controller;

import java.util.ArrayList;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.dao.DepartamentoDAO;
import com.example.projeto.model.Departamento;


@RestController

public class DeptoController {
	
	@Autowired
	private DepartamentoDAO daoDepto;
	
	@GetMapping("/depto")
	public ArrayList<Departamento> listarTudoDepto(){
		ArrayList<Departamento> lista = (ArrayList<Departamento>)daoDepto.findAll();
		return lista;
		
	}

}
