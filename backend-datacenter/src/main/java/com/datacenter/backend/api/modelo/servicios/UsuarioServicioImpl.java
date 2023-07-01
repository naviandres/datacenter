package com.datacenter.backend.api.modelo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datacenter.backend.api.modelo.dao.IUsuarioDao;
import com.datacenter.backend.api.modelo.entity.Usuario;

@Service
public class UsuarioServicioImpl implements IUsuarioServicio{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	public Usuario findByDocumento(String documento) {	
		return usuarioDao.findByDocumento(documento);
	}


}
