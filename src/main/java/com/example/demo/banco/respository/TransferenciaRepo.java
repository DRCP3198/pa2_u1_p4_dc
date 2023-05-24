package com.example.demo.banco.respository;

import com.example.demo.banco.respository.modelo.Transferencia;

public interface TransferenciaRepo {
	
	public void insertar(Transferencia transferencia);
    public void actualizar(Transferencia transferencia);
    public void eliminar(String numero);
    public Transferencia buscar(String numero);

}
