package com.bbvaitspain.colecciones;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Ordenador implements Serializable{
	public String marca;
	public String modelo;
	public Set<Pieza> componentes;
	
	public Ordenador() {
		this.marca = " ";
		this.modelo = " ";
		this.componentes = new HashSet<Pieza>();
		}
	
	public Ordenador(String marca, String modelo, Set<Pieza> componentes) {
		this.marca = marca;
		this.modelo = modelo;
		this.componentes = componentes;
	}
		
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Set<Pieza> getComponentes() {
		return componentes;
	}
	public void setComponentes(Set<Pieza> componentes) {
		this.componentes = componentes;
	}

	@Override
	public String toString() {
		return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", componentes=" + componentes + "]";
	}
	

	
}
