package practica2.practica2_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	private Topografia agua;
	private Topografia tierra;
	private Topografia pantano;
	private TopografiaMixta mixta;

	@BeforeEach
	public void setUp() {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixta = new TopografiaMixta(new Agua(), new Tierra(), new Agua(), new Tierra());
	}

	@Test
	public void testAgua() {
		assertTrue(agua.equals(new Agua()));
		assertFalse(agua.equals(new Tierra()));
		assertEquals(agua.proporcionAgua(), 1);
		assertEquals(agua.proporcionTierra(), 0);
	}

	@Test
	public void testTierra() {
		assertTrue(tierra.equals(new Tierra()));
		assertFalse(tierra.equals(new Agua()));
		assertEquals(tierra.proporcionAgua(), 0);
		assertEquals(tierra.proporcionTierra(), 1);
	}
	
	@Test
	public void testPantano() {
		assertTrue(pantano.equals(new Pantano()));
		assertFalse(pantano.equals(new Tierra()));
		assertEquals(pantano.proporcionAgua(), 0.7);
		System.out.println(pantano.proporcionAgua());
		System.out.println(pantano.proporcionTierra());
	}

	@Test
	public void testMixta() {
		assertTrue(mixta.equals(new TopografiaMixta(new Agua(), new Tierra(), new Agua(), new Tierra())));
		assertFalse(mixta.equals(new TopografiaMixta(new Tierra(), new Tierra(), new Agua(), new Tierra())));
		assertEquals(mixta.proporcionAgua(), 0.5);
	}
}
