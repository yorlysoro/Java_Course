package Eventos_Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoDeTeclado implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo = e.getKeyCode();
		System.out.println(codigo);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		System.out.println(letra);
	}

}
