package com.datacenter.backend.api.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datacenter.backend.api.modelo.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer>{

	@Query("select u from Usuario u where u.documento=?1")
	public Usuario findByDocumento(String documento);
}
