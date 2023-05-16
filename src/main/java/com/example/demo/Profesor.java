package com.example.demo;

import java.time.LocalDateTime;

public class Profesor {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime FechaNacimiento;
	
	
	//Set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", FechaNacimiento="
				+ FechaNacimiento + "]";
	}
	
	
	
	
	

}
