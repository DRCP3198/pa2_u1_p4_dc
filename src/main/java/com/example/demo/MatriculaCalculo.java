package com.example.demo;

public class MatriculaCalculo {
	
	public void realizarMatricula(String tipo) {
		if(tipo.equals("1")) {
			Materia mat = new Materia();
			mat.setNombre("P.Web");
			//Insertar en la base
			System.out.println("Se insertó MATERIA");
		}else {
			MateriaExtraordinaria matEx = new MateriaExtraordinaria();
			matEx.setNombre("P.Web");
			matEx.setCantidadCreditos(10);
			//Insertar en la base
			System.out.println("Se insertó MATERIA EXTRAORDINARIA");
		}
		
	}

}
