package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JacksonAdapter {

	private Jackson jackson = new Jackson();

	public String exportar(List<Socio> socios) {
		try {
			return jackson.exportarJson(socios);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
