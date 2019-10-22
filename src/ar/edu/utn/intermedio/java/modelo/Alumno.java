package ar.edu.utn.intermedio.java.modelo;

public class Alumno extends Persona {
	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
		}

	private Integer legajo;

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	@Override
	public void identificarse() {
	  //nombre apellido (legajo)
		
		String mensaje1 = (this.getApellido() +"-.--> "+ this.getNombre() +" "+ (this.legajo));
		System.out.println(mensaje1);
	}

	
}
