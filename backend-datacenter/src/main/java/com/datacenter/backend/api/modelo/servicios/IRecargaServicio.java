package com.datacenter.backend.api.modelo.servicios;

import java.util.List;

import com.datacenter.backend.api.modelo.entity.Recarga;

public interface IRecargaServicio {
	public List<Recarga> findAll();

	public Recarga guardar(Recarga cliente);

}
