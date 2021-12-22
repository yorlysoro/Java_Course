package multiple_fuentes;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;



public class PanelAccion extends JPanel{
	public PanelAccion() {
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/multiple_fuentes/yellow.gif"), Color.YELLOW);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/multiple_fuentes/blue.gif"), Color.BLUE);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/multiple_fuentes/red.gif"), Color.RED);

		JButton botonAmarillo = new JButton(accionAmarillo);
		JButton botonAzul = new JButton(accionAzul);
		JButton botonRojo = new JButton(accionRojo);
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		/*JButton botonAmarillo = new JButton("Amarillo");
		JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
	}
	
	private class AccionColor extends AbstractAction {

		public AccionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner de color " + nombre);
			putValue("color_de_fondo", color_boton);
			
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Color c = (Color) getValue("color_de_fondo");
			setBackground(c);
			System.out.println("Nombre: " + getValue(Action.NAME) +
					" Descripcion: " + getValue(Action.SHORT_DESCRIPTION));
		}

	}
}