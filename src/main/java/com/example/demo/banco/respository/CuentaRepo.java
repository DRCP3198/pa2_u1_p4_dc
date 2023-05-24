package com.example.demo.banco.respository;

import com.example.demo.banco.respository.modelo.Cuenta;

public interface CuentaRepo {
	
	public void insertar(Cuenta cuenta);
    public void actualizar(Cuenta cuenta);
    public void eliminar(String numero);
    public Cuenta buscar(String numero);

}
