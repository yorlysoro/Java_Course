package poo;

public class Furgoneta extends Coche {
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extras, int capacidad_carga) {
		super();
		// TODO Auto-generated constructor stub
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extras;
	}

	@Override
	public String toString() {
		return "Furgoneta [capacidad_carga=" + capacidad_carga + ", plazas_extra=" + plazas_extra + ", getRuedas()="
				+ getRuedas() + ", getLargo()=" + getLargo() + ", getAncho()=" + getAncho() + ", getMotor()="
				+ getMotor() + ", getPeso()=" + getPeso() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
