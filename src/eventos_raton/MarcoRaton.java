package eventos_raton;

import javax.swing.JFrame;

public class MarcoRaton extends JFrame{
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		//EventosDeRaton EventoRaton = new EventosDeRaton();
		//#EventoDeRaton EventoRaton = new EventoDeRaton();
		EventosDeRaton2 EventoRaton = new EventosDeRaton2();
		addMouseMotionListener(EventoRaton);
		
	}
}
