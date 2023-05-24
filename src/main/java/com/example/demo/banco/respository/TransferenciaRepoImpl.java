package com.example.demo.banco.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.respository.modelo.Cuenta;
import com.example.demo.banco.respository.modelo.Transferencia;
import com.example.demo.modelo.Estudiante;

@Repository
public class TransferenciaRepoImpl implements TransferenciaRepo{
    
	private List<Transferencia> baseDatos = new ArrayList<>();

	
	@Override
	public void insertar(Transferencia transferencia) {
		
		baseDatos.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		
		Transferencia trans =this.buscar(numero);
		baseDatos.remove(trans);
	}

	@Override
	public Transferencia buscar(String numero) {
		
		Transferencia transEncontrado= new Transferencia();
		for(Transferencia trans : baseDatos) { 
			if(numero.equals(trans.getNumero())) {
				transEncontrado=trans;
				
			}
		}
		return transEncontrado;
	}

}
