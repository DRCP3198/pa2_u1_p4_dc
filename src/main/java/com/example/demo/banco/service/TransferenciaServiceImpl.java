package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.respository.CuentaRepo;
import com.example.demo.banco.respository.TransferenciaRepo;
import com.example.demo.banco.respository.modelo.Cuenta;
import com.example.demo.banco.respository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	@Autowired
	private TransferenciaRepo transferenciaRepo;
	
	@Autowired 
	private CuentaRepo  cuentaRepo;
	
	@Override
	public void agregar(Transferencia transferencia) {
		this.transferenciaRepo.insertar(transferencia);
		
	}

	@Override
	public void modificarr(Transferencia transferencia) {
	
		this.transferenciaRepo.actualizar(transferencia);
	}

	@Override
	public void borrar(String numero) {
	    this.transferenciaRepo.eliminar(numero);
		
	}

	@Override
	public Transferencia encontrar(String numero) {
	
		return this.transferenciaRepo.buscar(numero);
	}

	@Override
	public void realizarTransferencia(BigDecimal monto, String cuentaOrigen, String CuentaDestino) {
	    //1. Paso Consultar la Cuenta de Origen por el numero de cuenta
		Cuenta ctaOrigen=this.cuentaRepo.buscar(cuentaOrigen);
		//2. Consultar el saldo de la cuenta de Origen
		BigDecimal saldoOrigen=ctaOrigen.getSaldo();
		//3. validar si el saldo es suficiente
		if(monto.compareTo(saldoOrigen)<=0) {
			System.out.println("TRANFERENCIA EXITOSA");
			//4. Si no es suficiente imprimir mensaje de no hay saldo disponible
			//5. Si es suficiente ir al paso 6
			//6. Realizamos la resta del saldo origen menos el monto
			BigDecimal nuevoSaldoOrigen= saldoOrigen.subtract(monto);
			//7. Actualizamos el saldo de la cuenta Origen
			ctaOrigen.setSaldo(nuevoSaldoOrigen);
			this.cuentaRepo.actualizar(ctaOrigen);
			//8. Consultamos la cuenta de Destino por el número
			Cuenta ctaDestino= this.cuentaRepo.buscar(CuentaDestino);
			//9. Consultamos el saldo de la cuenta destino
			BigDecimal saldoDestino = ctaDestino.getSaldo();
			//10. Realizamos la suma del saldo destino mas el monto
			BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
			//11. Actualizamos el nuevo saldo de la cuenta destino
			ctaDestino.setSaldo(nuevoSaldoDestino);
			this.cuentaRepo.actualizar(ctaDestino);
			//12. Creamos el registro/transferencia
			Transferencia transferenciaFinal = new Transferencia();
			transferenciaFinal.setOrigen(ctaOrigen);
			transferenciaFinal.setDestino(ctaDestino);
			transferenciaFinal.setMonto(monto);
			transferenciaFinal.setNumero("0001");
			transferenciaFinal.setFecha(LocalDateTime.now());
			this.transferenciaRepo.insertar(transferenciaFinal);
			
		}else {
			System.out.println("SALDO INSUFICIENTE TRANSFERENCIA FALLIDA ");
			System.out.println("Su saldo es: " + saldoOrigen);
		}
		
	}

}
