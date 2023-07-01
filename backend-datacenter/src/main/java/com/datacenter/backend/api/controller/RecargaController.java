package com.datacenter.backend.api.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datacenter.backend.api.modelo.entity.Recarga;
import com.datacenter.backend.api.modelo.servicios.IRecargaServicio;

@CrossOrigin(origins = { "http://localhost:4200/"})
@RestController
@RequestMapping("/api") 
public class RecargaController {

	@Autowired
	private IRecargaServicio recargaServicio;
	
	
	@GetMapping("/recargas")
	public List<Recarga> recargas() {
		return recargaServicio.findAll();
	}
	
	@PostMapping("/recargas") 
	public ResponseEntity<?> crear(@RequestBody Recarga recarga) {
		Map<String, Object> response = new HashMap<>();
		try {
			recarga.setFechaVenta(new Date());
			recargaServicio.guardar(recarga);
			response.put("mensaje", "La recarga ha sido creada");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (Exception e) {
			response.put("mensaje", "Error al crear recarga");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	
	}

}
