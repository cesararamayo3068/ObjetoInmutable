package com.developer.springboot.apirest.entities;

public final class Materia {
	
	private final String nombre;

	private final Integer calficacionAlumno;

	public String getNombre() {
		return nombre;
	}

	public Integer getCalficacionAlumno() {
		return calficacionAlumno;
	}

	public Materia(String nombre, Integer calficacionAlumno) {
		super();
		this.nombre = nombre;
		this.calficacionAlumno = calficacionAlumno;
	}
	
	

}
