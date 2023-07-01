package com.datacenter.backend.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datacenter.backend.api.modelo.entity.Usuario;
import com.datacenter.backend.api.modelo.servicios.IUsuarioServicio;

@CrossOrigin(origins = { "http://localhost:4200/"})
@RestController
@RequestMapping("/api") 
public class UsuarioController {

	@Autowired
	private IUsuarioServicio usuarioServicio;
	
	@PostMapping("/login") 
	public ResponseEntity<?> login(@RequestBody Usuario usuario) {
		Map<String, Object> response = new HashMap<>();
		try {
			if(usuario.getDocumento()==null || usuario.getClave()==null) {
				response.put("mensaje", "Valores vacios");
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
			}
			Usuario usuarioEncontrado = usuarioServicio.findByDocumento(usuario.getDocumento());
			if(!usuarioEncontrado.getEstado()) {
				response.put("mensaje", "Usuario inactivo");
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
			}else if(usuarioEncontrado.getClave().equals(usuario.getClave())) {
				return new ResponseEntity<Usuario>(usuarioEncontrado, HttpStatus.OK);
			}else {
				response.put("mensaje", "Clave incorrecta");
				return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			response.put("mensaje", "Uuario no encontrado");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
	}
}
