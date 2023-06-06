package com.example.demo.banco.respository.modelo;

import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
public class Impuesto {
	
	private Double iva;  //por que no es un valor monetario
	
	private BigDecimal iva_big;  //Usando Big decimal
	
	
	
	
	//set yb get

	@Override
	public String toString() {
		return "Impuesto [iva=" + iva + ", iva_big=" + iva_big + "]";
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public BigDecimal getIva_big() {
		return iva_big;
	}

	public void setIva_big(BigDecimal iva_big) {
		this.iva_big = iva_big;
	}
	
	
	
	

}
