package com.datacenter.backend.api.modelo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "recargas")
public class Recarga implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_recargas")
	private Integer idRecarga;
	

	@Column(name = "numero_celular")
	private String numeroCelular;
	
	private Double valor;
	
	@Column(name = "fecha_venta")
	@Temporal(TemporalType.DATE)
	private Date fechaVenta;
	
	@JoinColumn(name="fk_id_operador", referencedColumnName = "id_operador")
	@ManyToOne()	
	private Operador operador;
	
	@JoinColumn(name="fk_id_usuario", referencedColumnName = "id_usuario")
	@ManyToOne()	
	private Usuario usuario;

	public Integer getIdRecarga() {
		return idRecarga;
	}

	public void setIdRecarga(Integer idRecarga) {
		this.idRecarga = idRecarga;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
