package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.model.Produto;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "sayHello return";
	}
	
	@GetMapping("/produto")
	public Produto mostraProduto() {
		Produto prod = new Produto();
		prod.setId(1);
		prod.setNome("Nome");
		prod.setPreco(100);
		prod.setEstoque(2);
		return prod;
	}
	
}
