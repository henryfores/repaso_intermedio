package ar.edu.utn.intermedio.java.modelo;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Persona("a","B");
		p.identificarse();

		Alumno a = new Alumno ("Nombre alumno", "Apellido alumno");
		a.setLegajo(1234);
		a.identificarse();
		
		Docente d = new Docente ("Nombre Docente", "Apellido Docente");
		d.setCodigoEmpleado(12344);
		d.identificarse();
	}

}
