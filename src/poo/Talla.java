package poo;

public enum Talla {
	MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
	
	private Talla(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	
	public String getAbreviatura() {
		return this.abreviatura;
	}
	
	private String abreviatura;
}
