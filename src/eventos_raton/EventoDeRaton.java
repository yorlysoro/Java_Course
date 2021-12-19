package eventos_raton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventoDeRaton extends MouseAdapter {
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		//System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
//		System.out.println(e.getClickCount());
//	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getModifiersEx());
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el boton izquierdo");
		}else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado el boton cetral");
		}else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}
	}
}
