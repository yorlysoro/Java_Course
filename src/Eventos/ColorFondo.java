package Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFondo implements ActionListener{
	
	public ColorFondo(Color c) {
		colorDeFondo = c;
	}
	
	public void actionPerformed(ActionEvent e) {
		//setBackground(colorDeFondo);
	}
	private  Color colorDeFondo;

}
