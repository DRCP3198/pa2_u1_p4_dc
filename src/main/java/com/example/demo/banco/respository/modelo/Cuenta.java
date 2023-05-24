package com.example.demo.banco.respository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cuenta {
	
	private String numero;
	private String tipo;
	private BigDecimal saldo; //siempre para temas monetarios
	private String cedulaPropietario;
	private LocalDate fechaApertura;
	
	
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", cedulaPropietario="
				+ cedulaPropietario + ", fechaApertura=" + fechaApertura + "]";
	}
	//SET y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	

	
}
