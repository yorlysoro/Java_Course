package eventos_raton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventosDeRaton2 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Esta arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviedo el raton");
		
	}
	
}
