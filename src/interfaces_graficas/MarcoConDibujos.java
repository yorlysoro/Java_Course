package interfaces_graficas;

import java.awt.Color;

import javax.swing.JFrame;

public class MarcoConDibujos extends JFrame {
	public MarcoConDibujos() {
		this.setTitle("Marco con Dibujos");
		this.setSize(400,400);
		LaminoConFIguras lamina = new LaminoConFIguras();
		this.add(lamina);
		this.setBackground(Color.PINK);
	}
}
