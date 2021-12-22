package multiple_oyentes;

import javax.swing.JFrame;

public class Marco_Principal extends JFrame {
	public Marco_Principal() {
		setTitle("Prueba Varios");
		setBounds(1300,100,300,200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
	}
}
