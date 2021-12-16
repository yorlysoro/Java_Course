package interfaces_graficas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchuraPatalla=tamanoPantalla.width;
		
		this.setSize(anchuraPatalla/2, alturaPantalla/2);
		
		this.setLocation(anchuraPatalla/4, alturaPantalla/4);
		this.setTitle("marcoCentrado");
		
		Image miIcono = mipantalla.getImage("src/interfaces_graficas/icono.gif");
		this.setIconImage(miIcono);
	}

}
