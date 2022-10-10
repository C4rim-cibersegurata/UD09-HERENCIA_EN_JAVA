package C2_UD09_04;

public class Serie implements Entregable{
	private String titulo;
	private double numeroTemporadas=3;
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

	public int compareTo(Serie obj) {
		if(this.numeroTemporadas<obj.numeroTemporadas){
			return -1;
		}else if(this.numeroTemporadas==obj.numeroTemporadas){
			return 0;
		}else{
			return 1;
		}
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

	//Método toString sobreescrito
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
}