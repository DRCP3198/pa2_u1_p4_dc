package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface EstudianteService {
	
	public void agregar(Estudiante  estudiante);
	public void renovar(Estudiante estudiante);
	public Estudiante encontrarPorCedula(String cedula); //se busca por el identificador cédula
    public void borrarPorCedula(String cedula); //Se elimina por un identificador
    public List<Estudiante> reporteTodos();

}
