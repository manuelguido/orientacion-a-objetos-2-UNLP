package ar.edu.unlp.info.oo2.practica4_2;

import java.time.LocalDate;

public class FileOO2 implements File {

	private String nombre;
	private String extension;
	private Double tamaño;
	private LocalDate fechaDeCreacion;
	private LocalDate fechaDeModificacion;
	private String permisos;

	public FileOO2(String nombre, String extension, Double tamaño, LocalDate fechaDeCreacion,
			LocalDate fechaDeModificacion, String permisos) {
		super();
		this.setNombre(nombre);
		this.setExtension(extension);
		this.setTamaño(tamaño);
		this.setFechaDeCreacion(fechaDeCreacion);
		this.setFechaDeModificacion(fechaDeModificacion);
		this.setPermisos(permisos);
	}

	/**
	 * Getters & setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Double getTamaño() {
		return tamaño;
	}

	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}

	// Pretty print
	public String prettyPrint() {
		return "";
	}

}
