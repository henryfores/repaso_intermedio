package ar.edu.utn.intermedio.java.carro;

public class Vehiculo {

	private String color;
	private String marca;
	private Integer cantRuedas;
		private Integer cantidadMarchas;
	private Integer velocidadMaxima;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getCantRuedas() {
		return cantRuedas;
	}
	public void setCantRuedas(Integer cantRuedas) {
		this.cantRuedas = cantRuedas;
	} 
	public Integer getCantidadMarchas() {
		return cantidadMarchas;
	}
	public void setCantidadMarchas(Integer cantidadMarchas) {
		this.cantidadMarchas = cantidadMarchas;
	}
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public float velocidadPorMarcha() {
		float velProm = this.velocidadMaxima / this.cantidadMarchas;
		
		return velProm;
	}
	
	public void ruedas() {
		
		int las_ruedas =(this.cantRuedas);
 		
		System.out.println(las_ruedas);
	}
}
