package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface EstudianteRepo {
	
	public void insertar(Estudiante  estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(String cedula); //se busca por el identificador cédula
    public void eliminar(String cedula); //Se elimina por un identificador
    
}
