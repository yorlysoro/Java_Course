package cuadros_texto;

import javax.swing.JFrame;

public class MarcoTexto extends JFrame {
	public MarcoTexto() {
		setBounds(600,300,600,350);
		LaminaTexto milamina = new LaminaTexto();
		add(milamina);
		setVisible(true);
	}
}
