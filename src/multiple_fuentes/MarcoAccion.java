package multiple_fuentes;

import javax.swing.JFrame;

public class MarcoAccion extends JFrame {
	
	public MarcoAccion() {
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		PanelAccion lamina = new PanelAccion();
		add(lamina);
	}

}
