package com.datacenter.backend.api.modelo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datacenter.backend.api.modelo.dao.IRecargaDao;
import com.datacenter.backend.api.modelo.entity.Recarga;

@Service
public class RecargaServicioImpl implements IRecargaServicio {

	@Autowired
	private IRecargaDao recargaDao;

	@Override
	public List<Recarga> findAll() {
		return recargaDao.findAll();
	}

	@Override
	public Recarga guardar(Recarga cliente) {
		return recargaDao.save(cliente);

	}

}
