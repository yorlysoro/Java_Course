package interfaces_graficas;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame {

	public MarcoConTexto() {
		this.setVisible(true);
		this.setSize(600,450);
		this.setLocation(400, 200);
		this.setTitle("Primer Texto");
		
		Lamina milamina = new Lamina();
		this.add(milamina);
	}

}
