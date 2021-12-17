package Eventos;

import javax.swing.JFrame;

public class MarcoBotones extends JFrame {
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		LaminaBotones milamina = new LaminaBotones();
		add(milamina);
	}
}
