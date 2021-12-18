package Eventos_Ventanas;

import javax.swing.JFrame;

public class MarcoVentana extends JFrame {
	public MarcoVentana() {
		//setTitle("Respondiendo");
		setBounds(300,300,500,350);
		setVisible(true);
		//M_Ventana oyente_ventana = new M_Ventana();
		//addWindowListener(oyente_ventana);
		CambiaEstado nuevo_estado = new CambiaEstado();
		addWindowStateListener(nuevo_estado);
	}

}
