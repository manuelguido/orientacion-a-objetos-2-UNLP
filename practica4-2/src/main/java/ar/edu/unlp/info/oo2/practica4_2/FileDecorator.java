package ar.edu.unlp.info.oo2.practica4_2;

import java.time.LocalDate;

public abstract class FileDecorator implements File {

	private File component;
	
	protected abstract String print();
	
	public FileDecorator(File file) {
		this.setComponent(file);
	}
	
	public String prettyPrint() {
		if(this.component.prettyPrint() != "") {
			return this.component.prettyPrint() + " - " + this.print();
		}
		return this.print();
	}
	
	public File getComponent() {
		return component;
	}

	public void setComponent(File component) {
		this.component = component;
	}
	
	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public Double getTamaño() {
		return this.component.getTamaño();
	}

	@Override
	public LocalDate getFechaDeCreacion() {
		return this.component.getFechaDeCreacion();
	}

	@Override
	public LocalDate getFechaDeModificacion() {
		return this.component.getFechaDeModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}

}
