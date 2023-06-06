package com.example.demo;



import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.banco.respository.modelo.Cajero;
import com.example.demo.banco.respository.modelo.Cuenta;
import com.example.demo.banco.respository.modelo.Impuesto;
import com.example.demo.banco.respository.modelo.Presidente;
import com.example.demo.banco.respository.modelo.Transferencia;
import com.example.demo.banco.service.CalculoMontoDebitarService;
import com.example.demo.banco.service.CuentaService;
import com.example.demo.banco.service.ICargaSistemaService;
import com.example.demo.banco.service.TransferenciaService;
import com.example.demo.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DcApplication implements CommandLineRunner {

	@Autowired
	private Cajero cajero;
	
	@Autowired
	private Cajero cajero1;
	
	@Autowired
	private Presidente presidente;
	

	@Autowired
	private Presidente presidente2;
	
	@Autowired
	private ICargaSistemaService cargaSistemaService;
	
	@Autowired
	private Impuesto  impuesto;
	
	@Autowired 
	private TransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	System.out.println("+++++++++++++++++++++++++++++");	
    System.out.println("Primera Parte del Taller");	
	this.cajero.setNombre("Dillan");
	this.cajero.setApellido("Coloma");
	this.cajero.setSalario(new BigDecimal(450));
	System.out.println(this.cajero);
	
	this.cajero1.setApellido("Terán");
	this.cajero1.setSalario(new BigDecimal(325));
	System.out.println(this.cajero1);
	System.out.println(this.cajero1.getApellido());
	
	this.presidente.setApellido("Benitez");
	this.presidente.setNombre("Veronica");
	this.presidente.setCedula("165626262");
	System.out.println(this.presidente);
	
	this.presidente2.setApellido("Colon");
	//this.presidente2.setNombre("Andrea");
	//this.presidente2.setCedula("165626262");
	System.out.println(this.presidente2);
	System.out.println("+++++++++++++++++++++++++++++");
	System.out.println("Segunda Parte del Taller");
	this.cargaSistemaService.cargar();
	
	Transferencia transferencia = new Transferencia();
	transferencia.setDestino(null);
	transferencia.setOrigen(null);
	transferencia.setFecha(LocalDateTime.now());
	transferencia.setMonto(new BigDecimal(100));
	transferencia.setNumero("123232");
	this.transferenciaService.agregar(transferencia);
	//System.out.println(this.impuesto);
	
	//Por lo general va a ser catalogos y parametros
	
	}

}
