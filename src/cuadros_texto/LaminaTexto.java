package cuadros_texto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaTexto extends JPanel {
	
	public LaminaTexto() {
		setLayout(new BorderLayout());
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());
		JLabel texto1 = new JLabel("Email: ");
		milamina2.add(texto1);
		resultado = new JLabel("", JLabel.CENTER);
		campo1 = new JTextField(20);
		milamina2.add(campo1);
		add(resultado, BorderLayout.CENTER);
		JButton miboton = new JButton("Comprobar");
		DameTexto mievento = new DameTexto();
		miboton.addActionListener(mievento);
		milamina2.add(miboton);
		add(milamina2, BorderLayout.NORTH);
	}
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int correcto = 0;
			String email = campo1.getText().trim();
			for(int i = 0; i < email.length(); i++) {
				if(email.charAt(i)=='@') {
					correcto++;
				}
			}
			if(correcto!=1) {
				resultado.setText("Incorrecto!!");
			}else {
				resultado.setText("Correcto!!");
			}
			System.out.println(campo1.getText());
			
		}
		
	}
	private JTextField campo1;
	private JLabel resultado;
}
