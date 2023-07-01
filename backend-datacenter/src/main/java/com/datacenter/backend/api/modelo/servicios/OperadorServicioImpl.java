package com.datacenter.backend.api.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datacenter.backend.api.modelo.dao.IOperadorDao;
import com.datacenter.backend.api.modelo.entity.Operador;

@Service
public class OperadorServicioImpl implements IOperadorServicio{

	@Autowired
	private IOperadorDao operadorDao;
	
	@Override
	public List<Operador> findAll() {
		return operadorDao.findAll();
	}


}
