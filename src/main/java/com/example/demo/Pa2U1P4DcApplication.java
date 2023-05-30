package com.example.demo;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.respository.modelo.Cuenta;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DcApplication implements CommandLineRunner {

	@Autowired
	private CuentaService  cuentaService;
	@Autowired
	private TransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	Cuenta cuenta1 = new Cuenta();
	cuenta1.setCedulaPropietario("1725247645");
	cuenta1.setFechaApertura(LocalDate.now());
	cuenta1.setNumero("121212");
	cuenta1.setSaldo(new BigDecimal(200));
	cuenta1.setTipo("A");
	this.cuentaService.agregar(cuenta1);
	
	Cuenta cuenta2 = new Cuenta();
	cuenta2.setCedulaPropietario("172524767");
	cuenta2.setFechaApertura(LocalDate.now());
	cuenta2.setNumero("12345");
	cuenta2.setSaldo(new BigDecimal(100));
	cuenta2.setTipo("C");
	this.cuentaService.agregar(cuenta2);
	
	this.transferenciaService.realizarTransferencia(new BigDecimal(10), "121212", "12345");
	System.out.println("SALDO ORIGEN "+ this.cuentaService.encontrar("121212").getSaldo());
	System.out.println("SALDO DESTINO "+this.cuentaService.encontrar("12345").getSaldo());
	
	
	
	
	}

}
