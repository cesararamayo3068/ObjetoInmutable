package com.developer.springboot.apirest.entities;

import java.time.LocalDate;
import java.time.Month;

public class Principal {

	public static void main(String[] args) {

		LocalDate fechaFinalizacion = LocalDate.of(2021, Month.APRIL, 9);
		Estudiante estudiante = new Estudiante("Juan", 23, fechaFinalizacion, 3);

		System.out.println("Nombre :" + estudiante.getNombre());
		System.out.println("Edad :" + estudiante.getEdad());
		System.out.println("Fecha Finalización :" + estudiante.getfechaFinalizacion());
		System.out.println("Materias cursadas :" + estudiante.getMateriasCursadas());
		
		Materia materia = new Materia("Matematica",7);
		
		System.out.println("Nombre Materia :" + materia.getNombre());
		System.out.println("Calificación Alumno :" + materia.getCalficacionAlumno());
		

	}

}
