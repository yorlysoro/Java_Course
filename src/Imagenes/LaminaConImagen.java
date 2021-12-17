package Imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LaminaConImagen extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miimagen = new File("src/Imagenes/ball.gif");
		try {
			imagen = ImageIO.read(miimagen);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);
		g.drawImage(imagen, 0, 0, null);
		for(int i = 0; i < 4; i++) {
			g.copyArea(0, 0, anchuraImagen, alturaImagen, 150, 75);
		}
		
	}
	private Image imagen;
}
