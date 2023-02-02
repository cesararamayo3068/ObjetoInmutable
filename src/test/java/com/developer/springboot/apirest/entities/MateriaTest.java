package com.developer.springboot.apirest.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MateriaTest {

	@Test
	void testNombreMateria() {

		Materia materia = new Materia("Matematica", 7);
		String esperado = "Matematica";
		String real = materia.getNombre();

		assertAll(() -> assertEquals(esperado, real), () -> assertTrue(real.equals("Matematica")),
				() -> assertNotNull(real));
	}

	@Test
	void testCAlificacionAlumno() {
		Materia materia = new Materia("Matematica", 7);
		assertAll(() -> assertEquals(7, materia.getCalficacionAlumno().intValue()),
				() -> assertFalse(materia.getCalficacionAlumno().intValue() < 0),
				() -> assertTrue(materia.getCalficacionAlumno().intValue() > 0));
	}

	@Test
	void testReferenciaMateria() {
		Materia materia = new Materia("Matematica", 7);
		Materia materia2 = new Materia("Matematica", 7);

		assertEquals(materia2, materia);

	}
}
