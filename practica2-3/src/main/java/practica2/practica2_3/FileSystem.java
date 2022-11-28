package practica2.practica2_3;

import java.time.LocalDate;

public abstract class FileSystem {
	protected String nombre;
	protected LocalDate fecha;
	protected int tamano;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public void setFecha(LocalDate d) {
		this.fecha = d;
	}
	
	public int getTamano() {
		return tamano;
	}
	
	public void setTamano(Integer t) {
		tamano = t;
	}
	
	public int tamanoTotalOcupado() {
		return this.getTamano();
	}
	
	public abstract Archivo archivoMasGrande();
}
