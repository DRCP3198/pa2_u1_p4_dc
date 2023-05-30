package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.respository.CuentaRepo;
import com.example.demo.banco.respository.modelo.Cuenta;

@Service
public class CuentaServiceImpl implements CuentaService{
	
	@Autowired
	private CuentaRepo cuentaRepo;

	@Override
	public void agregar(Cuenta cuenta) {
		this.cuentaRepo.insertar(cuenta);
		
	}

	@Override
	public void modificar(Cuenta cuenta) {
		this.cuentaRepo.actualizar(cuenta);
	}

	@Override
	public void borrar(String numero) {
		
		this.cuentaRepo.eliminar(numero);
	}

	@Override
	public Cuenta encontrar(String numero) {
		//Solo cuando hace calculos es necesario llamar al service
		//cuando no los hace se llama al Repository
		return this.cuentaRepo.buscar(numero);
	}

}
