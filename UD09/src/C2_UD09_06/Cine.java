package C2_UD09_06;

public class Cine {

	//Atributos
	private Pelicula peli;
	private double price;
	private Sala sala; 
	
	//Constructores
	public Cine(Pelicula pelicula, double price) {
		
		peli = pelicula;
		this.price = price;
		sala = new Sala();
		
	}
	
	public Cine(Pelicula pelicula, double price, Sala sala) {
		
		peli = pelicula;
		this.price = price;
		this.sala = sala;
		
	}
	
	//Metodos
	public Pelicula getPeli() {
		return peli;
	}

	public double getPrice() {
		return price;
	}
	
	//Aqui comparo todos los condicionales que el espectador tiene que cumplir y si hay asientos disponibles
	public void anadirEspectador(Espectador espectador) {
		
		if (espectador.getMoney() >= price && espectador.getAge() >= peli.getMinAge() && !sala.isOcupatedAll()) {
		
			//En caso de entrar, mostramos que el espectador tiene todos los requisitos y le asignamos un asiento
			System.out.println("El espectador" + espectador.toString() + " puede pasar.");
			sala.getAsiento();
			
		} else {
			
			//En caso contrario seguimos mostrando al espectador para ver el por qué no ha entrado
			System.out.println("Este espectador" + espectador.toString() + " no puede acceder a ver la pelicula.");
		
		}
		
	}
	
}
