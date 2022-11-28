package ar.edu.unlp.info.oo2.practica4_2;

public class DecoratorFechaDeModificacion extends FileDecorator {

	public DecoratorFechaDeModificacion(File file) {
		super(file);
	}

	@Override
	public String print() {
		return this.getComponent().getFechaDeModificacion().toString();
	}
}
