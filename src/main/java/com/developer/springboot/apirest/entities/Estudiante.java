package com.developer.springboot.apirest.entities;

import java.time.LocalDate;


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

	

}
