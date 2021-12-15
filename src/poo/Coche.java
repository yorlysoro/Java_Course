package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso = 500;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Coche [ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + ", motor=" + motor + ", peso="
				+ peso + ", getRuedas()=" + getRuedas() + ", getLargo()=" + getLargo() + ", getAncho()=" + getAncho()
				+ ", getMotor()=" + getMotor() + ", getPeso()=" + getPeso() + "]";
	}
	
	
	
	
}
