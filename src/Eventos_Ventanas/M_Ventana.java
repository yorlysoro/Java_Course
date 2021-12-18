package Eventos_Ventanas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class M_Ventana extends WindowAdapter {

//	@Override
//	public void windowActivated(WindowEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Ventana Activada!");
//		
//	}
//
//	@Override
//	public void windowClosed(WindowEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Ventana Cerrada!");
//		
//	}
//
//	@Override
//	public void windowClosing(WindowEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("WindowClosing");
//		
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Ventana Deactivated");
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Window Deiconified!");
//		
//	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Ventana Minimizada!");
		
	}

//	@Override
//	public void windowOpened(WindowEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Window Opened");
//		
//	}

}
