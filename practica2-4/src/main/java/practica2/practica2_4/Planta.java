package practica2.practica2_4;

public class Planta extends Empleado {
	
	private int aniosAntiguedad;
	private int cantHijos;
	private boolean esCasado;
	
	public Planta(int aniosAntiguedad, int cantHijos, boolean esCasado) {
		this.setAniosAntiguedad(aniosAntiguedad);
		this.setCantHijos(cantHijos);
		this.setEsCasado(esCasado);
	}
	
	/**
	 * Setters & getters
	 */
	public void setAniosAntiguedad(int a) {
		this.aniosAntiguedad = a;
	}

	public int getAniosAntiguedad() {
		return this.aniosAntiguedad;
	}

	public void setCantHijos(int c) {
		this.cantHijos = c;
	}

	public int getCantHijos() {
		return this.cantHijos;
	}

	public void setEsCasado(boolean b) {
		this.esCasado = b;
	}

	public boolean getEsCasado() {
		return this.esCasado;
	}
	
	public double sueldoBasico() {
		return 50000;
	}
	
	public double sueldoAdicional() {
		int acum = 0;
		if (this.getEsCasado()) {
			acum = acum + 5000;
		}
		for (int i = 0; i < this.getCantHijos(); i++) {
			acum = acum + 2000;
		}
		for (int j = 0; j < this.getAniosAntiguedad(); j++) {
			acum = acum + 2000;
		}
		return acum;
	}
}
