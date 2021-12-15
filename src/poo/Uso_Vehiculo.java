package poo;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault = new Coche();
		System.out.println("Este coche tiene " + Renault.getRuedas() + " ruedas.");
		
		Furgoneta furgoneta = new Furgoneta(2, 2);
		System.out.println(furgoneta);
	}
	

}
