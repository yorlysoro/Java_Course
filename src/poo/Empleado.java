package poo;

import interfaces.Trabajadores;

public class Empleado<T> extends Persona implements Comparable<T>, Trabajadores{
	
	public Empleado(String nombre, float sueldo) {
		super(nombre);
		this.sueldo = sueldo;
		
		this.id = idSiguiente;
		this.idSiguiente++;
	}
	
	public float getSueldo() {
		return this.sueldo;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDescripcion() {
		return "Nombre: " + this.getNombre() + " Sueldo: " + this.getSueldo()
				+ " Id: " + this.getId();
	}
	private final int id;
	private static int idSiguiente=1;
	private float sueldo;
	
	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		Empleado otroEmpleado = (Empleado) arg0;
		if(this.sueldo  < otroEmpleado.sueldo) {
			return -1;
		}else if(this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		return Trabajadores.bonus_base +  gratificacion;
	}
}
