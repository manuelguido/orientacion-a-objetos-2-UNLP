/**
 * 
 */
package practica2.practica2_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {

	Directorio directorio1;
	Directorio directorio2;
	Directorio directorio3;
	FileSystem archivo1;
	FileSystem archivo2;
	FileSystem archivo3;

	@BeforeEach
	void setUp() throws Exception {
		directorio1 = new Directorio("Mis documentos", LocalDate.now());
		directorio2 = new Directorio("musica", LocalDate.now());
		directorio3 = new Directorio("imagenes", LocalDate.now());
		archivo1 = new Archivo("track.mp3", LocalDate.now(), 22);
		archivo2 = new Archivo("imagen1.jpg", LocalDate.now(), 29);
		archivo3 = new Archivo("imagen2.png", LocalDate.now(), 43);
	}

	@Test
	public void testNombreCompleto() {
		directorio1.agregarContenido(directorio2);
		directorio1.agregarContenido(directorio3);
		directorio2.agregarContenido(archivo1);
		directorio3.agregarContenido(archivo2);
		directorio3.agregarContenido(archivo3);
		
		// Tamano total ocupado (32 * 3 (directorios) + (22 + 29 + 43 archivos)) 
		assertEquals(190, directorio1.tamanoTotalOcupado());
		assertEquals(archivo3, directorio1.archivoMasGrande());
	}
}
