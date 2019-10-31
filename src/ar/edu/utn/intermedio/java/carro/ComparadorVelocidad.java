package ar.edu.utn.intermedio.java.carro;
import java.util.*;
public class ComparadorVelocidad implements Comparator<Moto>{

	

	@Override
	public int compare(Moto o1, Moto o2) {
		int resul1 = 0;
		int resul2 = 0;
		int ruedas1 = o1.getCantidadDeRuedas();
		int velocidad = o1.getVelocidadMaxima();
		resul1 = velocidad / ruedas1;
		return resul1;
		
		//int rueda = o2.getCantidadDeRuedas();
		//int velocidad2 = o2.getVelocidadMaxima();
		//resul2 = velocidad2 / rueda;
		//return resul2;
		
	}



}
