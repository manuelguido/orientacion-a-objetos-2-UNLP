package ar.edu.unlp.info.oo2.practica4_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FileOO2Test {

	private File archivo;
	
	@BeforeEach
	void setup() {
		this.setArchivo(new FileOO2("song", ".mp3", 2441.0, LocalDate.of(2022, 5, 10), LocalDate.of(2022, 5, 10), "lectura-escritura"));
	}

	@Test
	void testUno() {
		File decoratorNom = new DecoratorNombre(archivo);
		File decoratorExt = new DecoratorExtension(decoratorNom);
		assertEquals("song - .mp3", decoratorExt.prettyPrint());
		System.out.println(decoratorExt.prettyPrint());
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}	
}
