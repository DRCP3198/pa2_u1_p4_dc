package com.example.demo;

public class Materia {
	
	private String nombre;

	
	//SET y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + "]";
	}
	
	

}
