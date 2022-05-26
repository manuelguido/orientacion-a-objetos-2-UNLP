package practica2.practica2_1;

import java.util.Vector;

public class TopografiaMixta extends Topografia {
	Vector<Topografia> componentes;

	public TopografiaMixta(Topografia c1, Topografia c2, Topografia c3, Topografia c4) {
		this.componentes = new Vector<Topografia>(4);
		this.componentes.add(c1);
		this.componentes.add(c2);
		this.componentes.add(c3);
		this.componentes.add(c4);

	}

	@Override
	public double proporcionAgua() {
		return this.componentes.stream().mapToDouble(comp -> comp.proporcionAgua()).sum() / 4;
	}

	public Vector<Topografia> getComponentes() {
		return this.componentes;
	}

	@Override
	public boolean equals(Topografia c) {
		return this.getComponentes().equals(c.getComponentes());
	}
}
