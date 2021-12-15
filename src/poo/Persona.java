package poo;

public abstract class Persona {
	
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String getDescripcion();
	
	private String nombre;


}
