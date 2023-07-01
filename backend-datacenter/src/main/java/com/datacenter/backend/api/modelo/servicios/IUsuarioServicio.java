package com.datacenter.backend.api.modelo.servicios;

import com.datacenter.backend.api.modelo.entity.Usuario;

public interface IUsuarioServicio {
	public Usuario findByDocumento(String documento);
}
