package com.developer.springboot.apirest.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class EstudianteTest {

	@Test
	void testNombreEstudiante() {

		LocalDate fechaFinalizacion = LocalDate.now();
		Estudiante estudiante = new Estudiante("Juan", 23, fechaFinalizacion, 3);

		String esperado = "Juan";
		String real = estudiante.getNombre();
		assertEquals(esperado, real);
		assertTrue(real.equals("Juan"));

	}
	
	@Test
	void testEdadEstudiante() {
		LocalDate fechaFinalizacion = LocalDate.now();
		Estudiante estudiante = new Estudiante("Fernando", 18, fechaFinalizacion, 3);
		assertEquals(18, estudiante.getEdad().intValue());
		assertFalse(estudiante.getEdad().intValue() < 0);
		assertTrue(estudiante.getEdad().intValue() > 0);
	}
	
	@Test
	void testReferenciaEstudiante() {
		LocalDate fechaFinalizacion = LocalDate.of(2021, Month.APRIL, 9);
		Estudiante estudiante = new Estudiante("Fernando", 18, fechaFinalizacion, 3);
		
		Estudiante estudiante2 = new Estudiante("Fernando", 18, fechaFinalizacion, 3);
		
		assertEquals(estudiante2, estudiante);
		
	}

}
