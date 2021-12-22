package multiple_oyentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Lamina_Principal extends JPanel{
	public Lamina_Principal() {
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar Todo");
		add(boton_cerrar);
		OyenteNueve miOyente = new OyenteNueve();
		boton_nuevo.addActionListener(miOyente);
	}
	private class OyenteNueve implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
		}
		
	}
	JButton boton_cerrar;
}
