package practica2.practica2_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Directorio extends FileSystem {

	private ArrayList<FileSystem> contenido;

	public Directorio(String nombre, LocalDate fecha) {
		this.setNombre(nombre);
		this.setFecha(fecha);
		this.setTamano(32);
		this.contenido = new ArrayList<FileSystem>();
	}
	
	public ArrayList<FileSystem> getContenido() {
		return this.contenido;
	}
	
	public void agregarContenido(FileSystem fs) {
		this.getContenido().add(fs);
	}
	
	public int tamanoTotalOcupado() {
    	return this.getTamano() + this.getContenido().stream().mapToInt(fs -> fs.tamanoTotalOcupado()).sum();
	}
	
	public Archivo archivoMasGrande() {
        return this.contenido.stream().map(fs -> fs.archivoMasGrande()).max(Comparator.comparingInt(fs -> fs.tamanoTotalOcupado())).orElse(null);
	}
}
