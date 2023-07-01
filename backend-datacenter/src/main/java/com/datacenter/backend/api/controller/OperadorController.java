package com.datacenter.backend.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datacenter.backend.api.modelo.entity.Operador;
import com.datacenter.backend.api.modelo.servicios.IOperadorServicio;

@CrossOrigin(origins = { "http://localhost:4200/"})
@RestController
@RequestMapping("/api") 
public class OperadorController {

	@Autowired
	private IOperadorServicio operadorServicio;
	
	@GetMapping("/operadores")
	public List<Operador> operadores() {
		return operadorServicio.findAll();
	}
}
