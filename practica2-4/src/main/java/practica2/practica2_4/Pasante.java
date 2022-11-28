package practica2.practica2_4;

public class Pasante extends Empleado {

	private int cantExamenes;
	
	public Pasante(int cantExamenes) {
		this.setCantExamenes(cantExamenes);
	}
	
	
	/**
	 * Setters & getters
	 */
	public void setCantExamenes(int c){ 
		this.cantExamenes = c;
	}
	
	public int getCantExamenes(){ 
		return this.cantExamenes;
	}

	/**
	 * Metodos de sueldo
	 */
	public double sueldoBasico() {
		return 20000;
	}
	
	public double sueldoAdicional() {
		int acum = 0;
		for (int i = 0; i < this.getCantExamenes(); i++) {
			acum = acum + 2000;
		}
		return acum;
	}
}
