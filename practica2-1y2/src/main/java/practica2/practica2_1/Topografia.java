package practica2.practica2_1;

import java.util.Vector;

public abstract class Topografia {
	
	public abstract double proporcionAgua();
	
	public double proporcionTierra() {
		return 1 - this.proporcionAgua();
	}
	
	public boolean equals(Topografia c) {
		return this.proporcionAgua() == c.proporcionAgua();
	}
	
	public boolean equals(Object o) {
		return this.equals((Topografia) o);
	}
	
	public Vector<Topografia> getComponentes() {
		Vector<Topografia> vector = new Vector<Topografia>();
		vector.add(this);
		return vector;
	}
}
