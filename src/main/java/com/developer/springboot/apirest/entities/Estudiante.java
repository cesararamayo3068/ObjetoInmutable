package com.developer.springboot.apirest.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;

public final class Estudiante {
	private final String nombre;

	private final Integer edad;

	private final LocalDate fechaFinalizacion;

	private final Integer materiasCursadas;

	public Estudiante(String nombre, Integer edad, LocalDate fechaFinalizacion, Integer materiasCursadas) {

		this.nombre = nombre;
		this.edad = edad;
		this.fechaFinalizacion = fechaFinalizacion;
		this.materiasCursadas = materiasCursadas;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public Integer getMateriasCursadas() {
		return materiasCursadas;
	}

	public String getfechaFinalizacion() {
		return fechaFinalizacion.getDayOfMonth() + "/" + fechaFinalizacion.getMonth();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Estudiante)) {
			return false;
		}

		Estudiante e = (Estudiante) obj;
		
		if (this.nombre == null || this.edad == null || this.fechaFinalizacion == null || this.materiasCursadas == null) {
			return false;
		}
		return this.nombre.equals(e.getNombre()) && this.edad.equals(e.getEdad()) && this.materiasCursadas.equals(e.getMateriasCursadas());
	}

}
