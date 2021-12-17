package Fonts;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaFonts extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("DejaVu Sans", Font.BOLD, 26);
		g2.setFont(mifuente);
		g2.setColor(Color.BLUE);
		
		g2.drawString("Yorlys", 100, 100);
		
		
	}
}
