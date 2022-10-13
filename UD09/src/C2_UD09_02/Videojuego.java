package C2_UD09_02;

import java.lang.Comparable;

public class Videojuego implements Entregable, Comparable<Videojuego>{
	private String titulo;
	private double horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	//Constantes
	private final double HORASESTIMADAS=10;
	private final boolean ENTREGADO=false;
	
	//Constructor por defecto
	public Videojuego() {	
		this.titulo="";
		this.horasEstimadas=HORASESTIMADAS;
		this.genero="";
		this.compañia="";
		this.entregado=ENTREGADO;
	}
	//Constructor titulo y horas estimadas.

	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = "";
		this.horasEstimadas = 0;
		this.entregado=ENTREGADO;
		this.horasEstimadas=HORASESTIMADAS;

	}
	//Constructor con todos los atributos
	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado=ENTREGADO;
	}
	
	//Método para entregar videojuegos
	public boolean entregar() {
		System.out.println("Videojuego "+titulo+" entregado");
		return entregado=true;
	}
	//Método para devolver videojuegos
	public boolean devolver() {
		System.out.println("Videojuego "+titulo+" devuelto");
		return entregado=false;
	}
	//Método para conocer el estado de entrega
	public boolean isEntregado() {
		if(entregado) {
			System.out.println("El estado del videojuego " +titulo+ " es entregado");
			return entregado;
		}else{
			System.out.println("El estado del videojuego " +titulo+ " es no entregado");
			return entregado;
		}
	}
	
	//Método compareTo
	public int compareTo(Videojuego obj) {

		return (int) (this.horasEstimadas - obj.horasEstimadas);
		
	}

	//Getters y setters de todos los atributos except engtregado
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	//Metodo toString sobreescrito
	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Horas estimadas: " + horasEstimadas + ", Entregado: " + entregado
				+ ", Genero: " + genero + ", Compañia: " + compañia;
	}
	


	
	
}
