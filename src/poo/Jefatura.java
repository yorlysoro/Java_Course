package poo;

import interfaces.Jefes;
import interfaces.Trabajadores;

public class Jefatura extends Empleado implements Jefes{

	public Jefatura(String nombre, float sueldo) {
		super(nombre, sueldo);
	}
	@Override
	public String tomarDecisiones(String desicion) {
		// TODO Auto-generated method stub
		return desicion;
	}
	@Override
	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		double prima = 2000;
		return Trabajadores.bonus_base+ gratificacion + prima;
	}
	

}
