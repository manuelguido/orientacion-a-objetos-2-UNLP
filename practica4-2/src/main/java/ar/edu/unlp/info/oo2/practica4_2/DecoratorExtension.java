package ar.edu.unlp.info.oo2.practica4_2;

public class DecoratorExtension extends FileDecorator {

	public DecoratorExtension(File file) {
		super(file);
	}

	@Override
	public String print() {
		return this.getComponent().getExtension();
	}
}
