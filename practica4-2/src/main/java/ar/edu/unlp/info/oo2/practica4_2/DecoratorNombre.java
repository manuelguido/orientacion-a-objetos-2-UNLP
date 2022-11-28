package ar.edu.unlp.info.oo2.practica4_2;

public class DecoratorNombre extends FileDecorator {

	public DecoratorNombre(File file) {
		super(file);
	}

	@Override
	public String print() {
		return this.getComponent().getNombre();
	}
}
