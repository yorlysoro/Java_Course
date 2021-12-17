package Eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaBotones extends JPanel {
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		
		
		botonAzul.addActionListener(Azul);
		botonRojo.addActionListener(Rojo);
		botonAmarillo.addActionListener(Amarillo);
	}
	
//	public void actionPerformed(ActionEvent e) {
//		Object botonPulsado = e.getSource();
//		
//		if(botonPulsado==botonAzul)
//			setBackground(Color.BLUE);
//		else if(botonPulsado==botonAmarillo)
//			setBackground(Color.YELLOW);
//		else
//			setBackground(Color.RED);
//	}
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
		private  Color colorDeFondo;

	}

}
