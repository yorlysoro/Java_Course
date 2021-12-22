package layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Layout2 extends JPanel{
	public Panel_Layout2() {
		BorderLayout disposicion = new BorderLayout();
		setLayout(disposicion);
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verder"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
	}

}
