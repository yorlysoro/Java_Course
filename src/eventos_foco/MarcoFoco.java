package eventos_foco;

import javax.swing.JFrame;

public class MarcoFoco extends JFrame {
	public MarcoFoco() {
		setVisible(true);
		setBounds(300,300,600,450);
		add(new LaminaFoco());
	}
}
