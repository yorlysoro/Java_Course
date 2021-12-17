package Imagenes;

import javax.swing.JFrame;

public class MarcoImagen extends JFrame {
	public MarcoImagen() {
		setTitle("Marco Con Imagen");
		setBounds(750,300,300,200);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}
