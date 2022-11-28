package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseAccessProxyTest {
	private DatabaseAccessProxy proxy;
	private String password = "password";

	@BeforeEach
	void setup() throws Exception {
		this.proxy = new DatabaseAccessProxy(this.password);
	}
	
	@Test
	void testAuthenticate() {
		this.proxy.authenticate(this.password);
		assertTrue(this.proxy.isAuthenticated());
	}
	
    @Test
    void testGetSearchResults() {
    	this.proxy.authenticate(this.password);
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxy.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxy.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
    	this.proxy.authenticate(this.password);
        assertEquals(3, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxy.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testNotGetSearchResults() {
        assertEquals(null, this.proxy.getSearchResults("select * from comics where id=1"));
    }

    @Test
    void testNotInsertNewRow() {
        assertEquals(0, this.proxy.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}
