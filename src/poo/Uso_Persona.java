package poo;

import java.util.Arrays;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[3];
		
		lasPersonas[0] = new Empleado("Yorlys", 350);
		lasPersonas[1] = new Empleado("Yorlys2", 150);
		lasPersonas[2] = new Empleado("Yorlys3", 250);
		Jefatura jefe = new Jefatura("Jefe", 1500);
		//lasPersonas[1] = new Alumno("El Gato", "Animales");
		Arrays.sort(lasPersonas);
		for(Persona p: lasPersonas) {
			System.out.println(p.getDescripcion());
		}
		
		System.out.println(jefe.tomarDecisiones("Decision")
				+ "Bonus: " + jefe.establece_bonus(500));
	}

}
