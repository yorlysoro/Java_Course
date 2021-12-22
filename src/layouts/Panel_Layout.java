package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Layout extends JPanel {
	public Panel_Layout() {
		FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		setLayout(disposicion);

		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		
	}
}
