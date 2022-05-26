package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	private Biblioteca biblioteca;
	private Socio socio1;
	private Socio socio2;

	@BeforeEach
	public void setUp() throws Exception {
		biblioteca = new Biblioteca();
		socio1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
		biblioteca.agregarSocio(socio1);
		biblioteca.agregarSocio(socio2);	
	}
    @Test
    public void testImrpimirUsuarios() {
    	System.out.println(biblioteca.exportarSocios());
    	Object objeto = JSONValue.parse(biblioteca.exportarSocios());
    	JSONArray arreglo = (JSONArray)objeto;
    	ArrayList<Socio> listaSocios = new ArrayList<Socio>();
    	listaSocios.add(socio1);
    	listaSocios.add(socio2);
    	
    	for(int i = 0; i < arreglo.size(); i++) {
    		JSONObject posicion = (JSONObject)arreglo.get(i);
    		assertEquals(posicion.get("nombre"), listaSocios.get(i).getNombre());
    		assertEquals(posicion.get("email"), listaSocios.get(i).getEmail());
    		assertEquals(posicion.get("legajo"), listaSocios.get(i).getLegajo());
    	}
    }
}
