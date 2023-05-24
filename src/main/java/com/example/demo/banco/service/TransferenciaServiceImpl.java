package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.respository.TransferenciaRepo;
import com.example.demo.banco.respository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private TransferenciaRepo transferenciaRepo;
	@Override
	public void agregar(Transferencia transferencia) {
		this.transferenciaRepo.insertar(transferencia);
		
	}

	@Override
	public void modificarr(Transferencia transferencia) {
	
		this.transferenciaRepo.actualizar(transferencia);
	}

	@Override
	public void borrar(String numero) {
	    this.transferenciaRepo.eliminar(numero);
		
	}

	@Override
	public Transferencia encontrar(String numero) {
	
		return this.transferenciaRepo.buscar(numero);
	}

}
