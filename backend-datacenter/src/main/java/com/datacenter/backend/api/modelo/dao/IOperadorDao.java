package com.datacenter.backend.api.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datacenter.backend.api.modelo.entity.Operador;


public interface IOperadorDao extends JpaRepository<Operador, Integer>{

}
