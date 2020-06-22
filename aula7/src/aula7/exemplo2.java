package aula7;

public class exemplo2 {

	//Tributo privados
	private double numero1, numero2;
	
	public void setNumero(double numero1,double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public double getNumero1() {
		return this.numero1;
	}
	
	public double getNumero2() {
		return this.numero2;
	}
	
	double soma() {
		return (getNumero1() + getNumero2());
	}
}
