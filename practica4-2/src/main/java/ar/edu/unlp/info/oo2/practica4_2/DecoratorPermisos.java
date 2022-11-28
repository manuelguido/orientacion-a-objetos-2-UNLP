package ar.edu.unlp.info.oo2.practica4_2;

public class DecoratorPermisos extends FileDecorator {

	public DecoratorPermisos(File file) {
		super(file);
	}

	@Override
	public String print() {
		return this.getComponent().getPermisos();
	}
}
