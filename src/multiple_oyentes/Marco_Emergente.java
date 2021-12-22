package multiple_oyentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton boton_de_principal) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			dispose();
			contador--;
		}
		
	}
	private static int contador=0;
}
