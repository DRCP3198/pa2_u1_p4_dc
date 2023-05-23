package com.example.demo;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U1P4DcApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//voy a guardar estudiante
		Estudiante miEstudiante = new Estudiante();
		miEstudiante.setApellido("Coloma");
		miEstudiante.setCedula("1751457167");
		miEstudiante.setNombre("Dillan");
		miEstudiante.setFecha(LocalDateTime.of(1998, 8, 31, 10, 50));
		
		
		Estudiante miEstudiante1 = new Estudiante();
		miEstudiante1.setApellido("Narvaez");
		miEstudiante1.setCedula("1719954370");
		miEstudiante1.setNombre("Josue");
		miEstudiante1.setFecha(LocalDateTime.of(1998, 8, 31, 10, 50));
		//1.GUARDAR
		this.estudianteService.agregar(miEstudiante);
		this.estudianteService.agregar(miEstudiante1);
		
		
		
		//5.IMPRIMIR REPORTE
		List<Estudiante> reporte = this.estudianteService.reporteTodos();
	    System.out.println("Reporte de todos los estudiantes");
		for (Estudiante estudiante : reporte) {
			System.out.println(estudiante);
		}
		//2.ACTUALIZAR
		miEstudiante1.setApellido("Romero");
		this.estudianteService.renovar(miEstudiante1);
		
		//5.IMPRIMIR REPORTE
				List<Estudiante> reporte1 = this.estudianteService.reporteTodos();
			    System.out.println("Reporte de todos los estudiantes actualizados");
				for (Estudiante estudiante : reporte1) {
					System.out.println(estudiante);
				}
				
		 //3. ELIMINAR
		  this.estudianteService.borrarPorCedula("1751457167");	
		//5.IMPRIMIR REPORTE
			List<Estudiante> reporte2 = this.estudianteService.reporteTodos();
		    System.out.println("Reporte de todos los estudiantes eliminados");
			for (Estudiante estudiante : reporte2) {
				System.out.println(estudiante);
			}
			
		//4.BUSCAR POR CEDULA
			Estudiante e = this.estudianteService.encontrarPorCedula("1719954370");
			System.out.println("Estudiante por cedula existente "+e);
			Estudiante e1= this.estudianteService.encontrarPorCedula("12131212");
			System.out.println("Estudiante por cedula Nula  " + e1);
	}


}
