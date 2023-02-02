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
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Materia)) {
			return false;
		}

		Materia m = (Materia) obj;
		
		if (this.nombre == null || this.calficacionAlumno == null) {
			return false;
		}
		return this.nombre.equals(m.getNombre()) && this.calficacionAlumno.equals(m.getCalficacionAlumno());
	}

}
