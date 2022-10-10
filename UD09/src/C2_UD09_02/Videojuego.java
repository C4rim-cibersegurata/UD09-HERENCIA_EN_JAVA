package C2_UD09_04;

public class Videojuego implements Entregable {
	private String titulo;
	private double horasEstimadas;
	private boolean entregado=false;
	private String genero;
	private String compañia;
	
	//Constructor por defecto
	public Videojuego() {		
	}
	//Constructor titulo y horas estimadas.

	public Videojuego(String titulo, double horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}
	//Constructor con todos los atributos
	public Videojuego(String titulo, double horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
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
	


		public String compareTo(Object obj) {
			/*double resultado=0;
			Videojuego videojuego =(Videojuego)obj;
			if(this.horasEstimadas<videojuego.horasEstimadas) {
				resultado=videojuego.horasEstimadas;
				return resultado;
			}else {
				return this.horasEstimadas;
			}*/
			return "";
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
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	


	
	
}
