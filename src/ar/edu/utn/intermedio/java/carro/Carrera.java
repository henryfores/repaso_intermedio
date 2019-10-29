package ar.edu.utn.intermedio.java.carro;
import java.util.ArrayList;
import java.util.Scanner;
public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Moto> listaMotos = new ArrayList();
		
		Moto moto1 = new Moto("Azul","yamaha",2);
		Moto moto2 = new Moto("Roja","Honda",2);
		Moto moto3 = new Moto("Verde","Suzuki",2);
		listaMotos.add(moto1);
		listaMotos.add(moto2);
		listaMotos.add(moto3);
		
		Integer minimo = Integer.MIN_VALUE;
		
		Scanner  scanner  = new Scanner (System.in);
		for(Moto moto : listaMotos) {
			
			System.out.println("Ingrese velocidad " + moto.getMarca());
			moto.setVelocidadMaxima(scanner.nextInt());
			System.out.println("Metros Avanzados: " + moto.avanzar(120));
		}
		
		
		int velocidadMaxima = 100;
		int tiempoMinutos = 120;
		
		int distancia = velocidadMaxima * tiempoMinutos/60;
		
		
				
	}

}
