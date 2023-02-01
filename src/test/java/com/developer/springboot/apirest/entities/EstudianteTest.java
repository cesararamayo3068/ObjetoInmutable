package com.developer.springboot.apirest.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EstudianteTest {

	
	
	@Test
	void testReferenciaEstudiante() {
		LocalDate fechaFinalizacion = LocalDate.now();
		Estudiante estudiante = new Estudiante("Fernando", 18, fechaFinalizacion, 3);
		
		Estudiante estudiante2 = new Estudiante("Fernando", 18, fechaFinalizacion, 3);
		
		assertEquals(estudiante2, estudiante);
		
	}

}
