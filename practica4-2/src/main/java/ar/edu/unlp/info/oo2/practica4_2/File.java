package ar.edu.unlp.info.oo2.practica4_2;

import java.time.LocalDate;

public interface File {
	public String prettyPrint();

	public String getNombre();
	public String getExtension();
	public Double getTamaño();
	public LocalDate getFechaDeCreacion();
	public LocalDate getFechaDeModificacion();
	public String getPermisos();
}
