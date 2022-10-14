package C2_UD09_06;

public class MainApp {

	public static void main(String[] args) {
		
		//Creamos un array
		Espectador colaEspectador[] = new Espectador[50];
		
		for (int i = 0; i < colaEspectador.length; i++) {
			
			//Ponemos un valor aleatorio en edad y precio, asignamos como nombre la posición del array 
			int age = (int)Math.floor(Math.random() * (40));
			double money = Math.floor(Math.random() * (50));
			
			colaEspectador[i] = new Espectador("" + (i+1), age, money);
			
		}
		
		//Añadimos otro valor aleatorio para la edad minima
		int agemin = (int)Math.floor((Math.random() * (15)) + 3);
		
		//Creamos pelicula y cine con un valor de 7€
		Pelicula estreno = new Pelicula("Mario Bros", 90.6, agemin, "Nintendo");
		Cine lauren = new Cine(estreno, 7);
		
		//Mostramos la edad minima para ver que funciona correctamente
		System.out.println("Edad minima para ver la pelicula: " + estreno.getMinAge() + " años\n");
		
		//Añadimos todos los espectadores que cumplan los requisitos
		for (int i = 0; i < colaEspectador.length; i++) {
			
			lauren.anadirEspectador(colaEspectador[i]);
			System.out.println();
			
		}
		
	}

}
