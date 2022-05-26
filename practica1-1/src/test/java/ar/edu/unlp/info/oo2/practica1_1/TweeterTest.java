/**
 * 
 */
package ar.edu.unlp.info.oo2.practica1_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TweeterTest {
	
	Tweeter tweeter;
	String screenName = "Guido";
	String screenName2 = "Manuel";
	Usuario usuario;
	
	@BeforeEach
	public void setUp() throws Exception {
		tweeter = new Tweeter();
    	tweeter.crearUsuario(screenName);
	}
    @Test
    public void testCrearUsuario() {
        Usuario usuarioExistente = tweeter.getUsuarios()
        		.stream()
        		.filter(usuario -> 
        			screenName.equals(usuario.getScreenName()))
        		.findAny()
        		.orElse(null);
      assertEquals(screenName, usuarioExistente.getScreenName());
    }
    
    @Test
    public void testEliminarUsuario() {
    	usuario = new Usuario(screenName2);
    	tweeter.eliminarUsuario(usuario);
        Usuario usuarioExistente = tweeter.getUsuarios()
        		.stream()
        		.filter(usuario -> 
        			screenName2.equals(usuario.getScreenName()))
        		.findAny()
        		.orElse(null);
      assertEquals(null, usuarioExistente);
    }
}
