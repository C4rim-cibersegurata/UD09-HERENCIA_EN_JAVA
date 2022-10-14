package C2_UD09_06;

public class Pelicula {

	//Atributos
	private String title;
	private double duration;
	private int minAge;
	private String director;
	
	//Constructores
	public Pelicula(String title, double duration, int minAge, String director) {
		
		this.title = title;
		this.duration = duration;
		this.minAge = minAge;
		this.director = director;
		
	}

	//Metodos
	public String getTitle() {
		return title;
	}

	public double getDuration() {
		return duration;
	}

	public int getMinAge() {
		return minAge;
	}

	public String getDirector() {
		return director;
	}
	
}
