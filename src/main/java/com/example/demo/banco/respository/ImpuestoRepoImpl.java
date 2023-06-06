package com.example.demo.banco.respository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.respository.modelo.Impuesto;

@Repository
public class ImpuestoRepoImpl implements IImpuestoRepo{

	

	
	@Override
	public BigDecimal selecionar(String codigoImpuesto) {
		// TODO Auto-generated method stub
		return new BigDecimal(12);
	}
}
