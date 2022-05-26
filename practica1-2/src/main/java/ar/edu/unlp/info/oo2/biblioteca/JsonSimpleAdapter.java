package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class JsonSimpleAdapter extends VoorheesExporter {

	private JsonSimple jsonSimple = new JsonSimple();

	public String exportar(List<Socio> socios) {
		// Diferente nombre para mostrar que se "adapta"
		return this.jsonSimple.exportarJson(socios);
	}
}
