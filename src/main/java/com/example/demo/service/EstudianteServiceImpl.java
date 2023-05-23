package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.EstudianteRepo;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void agregar(Estudiante estudiante) {
		
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void renovar(Estudiante estudiante) {
		
	   this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante encontrarPorCedula(String cedula) {
	
		return this.estudianteRepo.buscar(cedula);
	}

	@Override
	public void borrarPorCedula(String cedula) {
	
		this.estudianteRepo.eliminar(cedula);
	}

	@Override
	public List<Estudiante> reporteTodos() {
		
		return this.estudianteRepo.buscarTodos();
	}
	
}
