package interfaces_graficas;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo swing", 100, 100);
	}

}
