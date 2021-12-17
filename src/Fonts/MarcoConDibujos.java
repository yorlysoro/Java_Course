package Fonts;

import java.awt.Color;

import javax.swing.JFrame;

public class MarcoConDibujos extends JFrame {
	public MarcoConDibujos() {
		this.setTitle("Marco con Dibujos");
		this.setSize(400,400);
		LaminaFonts lamina = new LaminaFonts();
		this.add(lamina);
		this.setBackground(Color.PINK);
	}
}
