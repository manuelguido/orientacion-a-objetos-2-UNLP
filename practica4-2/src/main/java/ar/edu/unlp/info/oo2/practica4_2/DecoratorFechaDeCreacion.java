package ar.edu.unlp.info.oo2.practica4_2;

public class DecoratorFechaDeCreacion extends FileDecorator {

	public DecoratorFechaDeCreacion(File file) {
		super(file);
	}

	@Override
	public String print() {
		return this.getComponent().getFechaDeCreacion().toString();
	}
}
