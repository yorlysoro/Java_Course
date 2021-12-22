package multiple_fuentes;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

public class AccionColor extends AbstractAction {

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
	}

}
