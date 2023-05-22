package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Estudiante;

public class EstudianteRepoImpl implements EstudianteRepo {

	//los metodos mock simulan metodos que generalemnte
	//se usan cuando se conecta a una base de datos.
	
	private static List<Estudiante> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		baseDatos.add(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		
	}

}
