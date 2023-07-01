package com.datacenter.backend.api.modelo.servicios;

import java.util.List;

import com.datacenter.backend.api.modelo.entity.Operador;

public interface IOperadorServicio {
	
	public List<Operador> findAll();

}
