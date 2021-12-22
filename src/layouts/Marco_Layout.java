package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Marco_Layout extends JFrame{
	public Marco_Layout() {
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		Panel_Layout lamina = new Panel_Layout();
		Panel_Layout2 lamina2 = new Panel_Layout2();
		add(lamina, BorderLayout.NORTH);
		add(lamina2, BorderLayout.SOUTH);
	}
}
