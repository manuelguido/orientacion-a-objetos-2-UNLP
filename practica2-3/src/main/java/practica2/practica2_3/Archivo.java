package practica2.practica2_3;

import java.time.LocalDate;

public class Archivo extends FileSystem {

	public Archivo(String nombre, LocalDate fecha, Integer tamano) {
		this.setNombre(nombre);
		this.setFecha(fecha);
		this.setTamano(tamano);
	}

	public Archivo archivoMasGrande() {
		return this;
	}
}
