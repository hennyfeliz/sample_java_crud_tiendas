package com.sv.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tiendas", catalog = "db_database", schema = "")
public class Tienda {

	@Column
	private String id_tienda;

	@Column
	private String nombre_tienda;

	@Column
	private String direcc_tienda;

	@Column
	private String ciudad;

	@Column
	private String estado;

	@Column
	private String pais;

	@Column
	private String cod_postal;

	@Column
	private String terminos;

	public String getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(String id_tienda) {
		this.id_tienda = id_tienda;
	}

	public String getNombre_tienda() {
		return nombre_tienda;
	}

	public void setNombre_tienda(String nombre_tienda) {
		this.nombre_tienda = nombre_tienda;
	}

	public String getDirecc_tienda() {
		return direcc_tienda;
	}

	public void setDirecc_tienda(String direcc_tienda) {
		this.direcc_tienda = direcc_tienda;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getTerminos() {
		return terminos;
	}

	public void setTerminos(String terminos) {
		this.terminos = terminos;
	}

}