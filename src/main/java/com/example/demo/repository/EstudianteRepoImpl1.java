package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl1 implements EstudianteRepo {

	//los metodos mock simulan metodos que generalemnte
	//se usan cuando se conecta a una base de datos.
	
	private static List<Estudiante> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estudiante) {
		baseDatos.add(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		Estudiante estu = this.buscar(estudiante.getCedula());
		this.eliminar(estudiante.getCedula());
		this.insertar(estudiante);
		
		
	}

	@Override
	public Estudiante buscar(String cedula) {
		
		Estudiante estuEncontrado= new Estudiante();
		for(Estudiante estu: baseDatos) {
			//hay que poner primero y evaluar con el elemento que tenga la certeza que no va a ser nulo. 
			if(cedula.equals(estu.getCedula())) {
				estuEncontrado=estu;
				
			}
		}
		return estuEncontrado;
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estu = this.buscar(cedula);
		baseDatos.remove(estu);
		
		
	}

	@Override
	public List<Estudiante> buscarTodos() {
		
		return baseDatos;
	}

}
