package com.example.demo.banco.service;

import com.example.demo.banco.respository.modelo.Transferencia;

public interface TransferenciaService {
	
	public void agregar(Transferencia transferencia);
    public void modificarr(Transferencia transferencia);
    public void borrar(String numero);
    public Transferencia encontrar(String numero);


}
