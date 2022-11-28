package practica2.practica2_4;

public class Temporario extends Empleado {

	private int cantHorasTrabajadas;
	private int cantHijos;
	private boolean esCasado;

	public Temporario(int cantHorasTrabajadas, int cantHijos, boolean esCasado) {
		this.setCantHorasTrabajadas(cantHorasTrabajadas);
		this.setCantHijos(cantHijos);
		this.setEsCasado(esCasado);
	}

	/**
	 * Setters & getters
	 */
	public void setCantHorasTrabajadas(int c) {
		this.cantHorasTrabajadas = c;
	}

	public int getCantHorasTrabajadas() {
		return this.cantHorasTrabajadas;
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

	/**
	 * Metodos de sueldo
	 */
	public double sueldoBasico() {
		return 20000 + (this.getCantHorasTrabajadas() * 300);
	}

	public double sueldoAdicional() {
		int acum = 0;
		if (this.getEsCasado()) {
			acum = acum + 5000;
		}
		for (int i = 0; i < this.getCantHijos(); i++) {
			acum = acum + 2000;
		}
		return acum;
	}

}
