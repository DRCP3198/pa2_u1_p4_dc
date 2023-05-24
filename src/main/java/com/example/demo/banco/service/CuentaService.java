package com.example.demo.banco.service;

import com.example.demo.banco.respository.modelo.Cuenta;

public interface CuentaService {

	public void agregar(Cuenta cuenta);
    public void modificar(Cuenta cuenta);
    public void borrar(String numero);
    public Cuenta encontrar(String numero);
}
