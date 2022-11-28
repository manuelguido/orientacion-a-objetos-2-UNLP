package ar.edu.unlp.info.oo2.practica4_2;

public class DecoratorTamaño extends FileDecorator {

	public DecoratorTamaño(File file) {
		super(file);
	}

	@Override
	public String print() {
		return this.getComponent().getTamaño().toString();
	}
}
