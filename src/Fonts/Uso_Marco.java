package Fonts;

import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Uso_Marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos miMarco = new MarcoConDibujos();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		String fuente = JOptionPane.showInputDialog("Introduce fuente:");
//		boolean estalafuente = false;
//		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//		for(String nombredelafuente: nombresDeFuentes) {
//			if(nombredelafuente.equals(fuente)) {
//				estalafuente = true;
//			}
//		}
//		
//		
//		if(estalafuente) {
//			System.out.println("Fuente Instalada");
//		}else {
//			System.out.println("No esta instalada la fuente");
//		}
	}

}
