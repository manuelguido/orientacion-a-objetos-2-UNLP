/**
 * 
 */
package practica2.practica2_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	Empleado temporario;
	Empleado pasante;
	Empleado planta;

	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(160, 2, true);
		pasante = new Pasante(3);
		planta = new Planta(12, 1, true);
	}

	@Test
	public void testTemporario() {
		// 160 horas trabajadas, 2 hijos, es casado
		assertEquals(68000, temporario.sueldoBasico());
		assertEquals(9000, temporario.sueldoAdicional());
		assertEquals(67710, temporario.sueldo());
	}
	
	@Test
	public void testPasante() {
		// 3 exámenes rendidos
		assertEquals(6000, pasante.sueldoAdicional());
		assertEquals(23100, pasante.sueldo());
	}
	
	@Test
	public void testPlanta() {
		// 12 años de antiguedad, 1 hijo, es casado
		assertEquals(31000, planta.sueldoAdicional());
		assertEquals(72950, planta.sueldo());
	}
}
