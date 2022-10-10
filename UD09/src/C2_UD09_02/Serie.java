package C2_UD09_02;

import java.lang.Comparable;

public class Serie implements Entregable, Comparable<Serie>{
	private String titulo;
	private int numeroTemporadas=3;
	private boolean entregado=false;
	private String genero;
	private String creador;
	

	//Constructor por defecto
	public Serie() {
		
	}
	//Constructor con el titulo y creador
	public Serie(String titulo,String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	//Constructor con todos los atributos
	public Serie(String titulo,int numeroTemporadas,String genero,String creador) {
		this.titulo=titulo;
		this.numeroTemporadas=numeroTemporadas;
		this.genero=genero;
		this.creador=creador;
	}
	
	//Método para entregar series
	public boolean entregar() {
		System.out.println("Serie "+titulo+" entregada");
		return entregado=true;
	}
	//Método para devolver series
	public boolean devolver() {
		System.out.println("Serie "+titulo+" devuelta");
		return entregado=false;
	}
	//Método conocer el estado de entrega
	public boolean isEntregado() {
		if(entregado) {
			System.out.println("El estado de la serie " +titulo+ " es entregado");
			return entregado;
		}else{
			System.out.println("El estado de la serie " +titulo+ " es no entregado");
			return entregado;
		}
		
		
	}
	//Método compareTo que va restando hasta tener 0 series
	public int compareTo(Serie obj) {
		return (int)(this.numeroTemporadas - obj.numeroTemporadas);
		
	}
	
	//Setters y getters de todos los atributos
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getNumeroTemporadas() {
		return numeroTemporadas;
	}
	
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	//Metodo toString sobreescrito
	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Numero de temporadas: " + numeroTemporadas + ", entregado: " + entregado
				+ ", genero: " + genero + ", creador: " + creador;
	}

	
}
