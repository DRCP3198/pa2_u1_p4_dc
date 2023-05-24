package com.example.demo.banco.respository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.respository.modelo.Cuenta;
import com.example.demo.modelo.Estudiante;

@Repository
public class CuentaRepoImpl implements CuentaRepo{
	
	private List<Cuenta> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Cuenta cuenta) {
		
		baseDatos.add(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		this.eliminar(cuenta.getNumero());
		this.insertar(cuenta);
	}

	@Override
	public void eliminar(String numero) {
		Cuenta cuenta = this.buscar(numero);
		baseDatos.remove(cuenta);
		
	}

	@Override
	public Cuenta buscar(String numero) {
		
		Cuenta cuentaEncontrada = new Cuenta();
		for (Cuenta cuenta : baseDatos) {
			if(numero.equals(cuenta.getNumero())){
				cuentaEncontrada=cuenta;
			}
		}
		return cuentaEncontrada;
	}

}
