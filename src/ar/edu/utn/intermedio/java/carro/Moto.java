package ar.edu.utn.intermedio.java.carro;

public class Moto extends Vehiculo implements Comparable<Moto> {

	public Moto(String color, String marca, Integer cantidadDeRuedas) {
		super(color, marca, cantidadDeRuedas);
		// TODO Auto-generated constructor stub
		}

	@Override
	public Integer getCantidadDeRuedas() {
		
			Integer RuedasMoto = 2;
		return RuedasMoto;
		
	

		
		
	}

	@Override
	public int compareTo(Moto otraMoto) {
		// Devolver numero positivo si la moto es mas rapida que la del parametro
		// Devolver numero negativo si la moto es mas lente que la del parametro
		// Devolver 0 si la moto esigual  de rapida  la del parametro
		
		int miVelocidad = getVelocidadMaxima();
		int velocidadDelaOtraMoto = otraMoto.getVelocidadMaxima();
		int cont = 0;
		if (miVelocidad < velocidadDelaOtraMoto) {
			
			cont = 1;
			
		} else if (miVelocidad > velocidadDelaOtraMoto) {
			
			cont = -1;
		}
		
	else if (miVelocidad == velocidadDelaOtraMoto) {
		
		cont = 0;
	}
			
//		System.out.println();
//		 System.out.println("Comparar con 'a' b es:" + miVelocidad.compareTo("b"));       
//	        str_Sample = "b";       
//		
		return cont;
	}
	
	

}