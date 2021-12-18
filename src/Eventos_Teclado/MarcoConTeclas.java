package Eventos_Teclado;

import javax.swing.JFrame;

public class MarcoConTeclas extends JFrame {
	public MarcoConTeclas() {
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
		setBounds(300,300,500,350);
		setVisible(true);
		
	}
}
