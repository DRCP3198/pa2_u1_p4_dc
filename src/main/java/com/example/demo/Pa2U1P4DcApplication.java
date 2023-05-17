package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4DcApplication implements CommandLineRunner {

	@Autowired
	private Profesor profe2;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		System.out.println("Mi primer proyecto");
		
		Profesor profe = new Profesor();
		 profe.setApellido("Coloma");
		 profe.setNombre("Dillan");
		 profe.setCedula("1751457167");
		 profe.setFechaNacimiento( LocalDateTime.now());
		 System.out.println(profe);
		 System.out.println(profe.getApellido());
		
	     
		 System.out.println(profe2);
		 profe2.setApellido("Teran");
		 profe2.setApellido("Pozo");
		 System.out.println(profe2.getApellido());
		 
		 Profesor profe3;
		 profe3 =profe;
		
		 System.out.println(profe3);
		 profe.setApellido("Martinez");
		 System.out.println(profe3);
		 profe3.setApellido("Lagos");
		 System.out.println(profe3);
		 
		 //***********************************************
		 MatriculaCalculo mat = new MatriculaCalculo();
		 mat.realizarMatricula("1");
	}

	/* Spring Framework:
	 * Permite a construccion/ desarrollo de aplicaciones empresariales
	 * basadas en Spring.
	 */
	
	
}
