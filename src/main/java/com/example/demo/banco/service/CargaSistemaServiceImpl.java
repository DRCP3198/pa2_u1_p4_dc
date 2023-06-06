package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.respository.IImpuestoRepo;
import com.example.demo.banco.respository.modelo.Impuesto;

@Service
public class CargaSistemaServiceImpl implements ICargaSistemaService {

	
	@Autowired
	private Impuesto impuesto;
	
	@Autowired
	private IImpuestoRepo iImpuestoRepo;
	
	@Override
	public void cargar() {
		// TODO Auto-generated method stub
		System.out.println("Inicia Carga de Impuestos");
		BigDecimal valorIva= this.iImpuestoRepo.selecionar("IVA");
		this.impuesto.setIva_big(valorIva);
		System.out.println("Fin carga de impuesto");
	}

}
