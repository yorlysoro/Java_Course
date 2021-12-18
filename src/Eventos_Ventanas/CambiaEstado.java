package Eventos_Ventanas;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estado cambiado");
		System.out.println(arg0.getNewState());
		
	}

}
