package com.bbvaitspain.colecciones;

import java.io.Serializable;

public class Pieza implements Serializable{
	public String nombre;
	public String tipo;
	public Ordenador ordenador;
	
	public Pieza() {
		this.nombre = " ";
		this.tipo = " ";
		this.ordenador = null;
	}
	
	public Pieza(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ordenador = ordenador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Ordenador getOrdenador() {
		return ordenador;
	}

	public void setOrdenador(Ordenador ordenador) {
		this.ordenador = ordenador;
	}
	
	@Override
	public String toString() {
		return "Pieza [nombre=" + nombre + ", tipo=" + tipo + "]";
	}

	

	
}
