package poo;

public class Alumno extends Persona {
	
	public Alumno(String nombre, String curso) {
		super(nombre);
		this.curso = curso;
	}
	
	public String getCurso() {
		return this.curso;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.getNombre() + " Curso: " + this.getCurso();
	}
	
	private String curso;
}
