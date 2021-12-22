package layouts;

import javax.swing.JFrame;

public class MarcoCalculadora extends JFrame {
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		add(milamina);
		//pack();
	}

}
