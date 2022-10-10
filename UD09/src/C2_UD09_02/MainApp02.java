package C2_UD09_04;
import java.util.Arrays;

public class MainApp02 {
	
	public static void main (String[] args) {
		//Creamos dos arrays con 5 series y 5 videojuegos.
		Serie serie[]= new Serie[5];  
		Videojuego videojuego[]= new Videojuego[5];
		int cuenta = 0;
		//Creamos series con distintos constructos.
		serie[0]=new Serie("Breaking bad",5,"Drama","Vince GIlligan");
		serie[1]=new Serie("The witcher",2,"Fantasia","Stephen Surjik");
		serie[2]=new Serie("Black mirror",4,"Ciencia ficción","Charlie Brooker");
		//Uno con solo título y creador
		serie[3]=new Serie("Juego de tronos","George R.R Martin");
		//Uno vacío
		serie[4]=new Serie();
		//Creamos videojuegos con distintos constructos
		videojuego[0]=new Videojuego("Final fantasy",60,"RPG","SquareEnix");
		videojuego[1]=new Videojuego("Mass effect",50,"RPG","Bioware");
		//Uno con solo título y horas estimadas
		videojuego[2]=new Videojuego("Zelda breath of the wild",55);
		//Uno vacío
		videojuego[3]=new Videojuego();
		videojuego[4]=new Videojuego("The binding of isaac",1000,"Roguelite","Edmund Mcmillen");
		
		//Entregamos tres series y tres de videojuegos.
		serie[0].entregar();
		serie[3].entregar();
		serie[4].entregar();
		videojuego[1].entregar();
		videojuego[2].entregar();
		videojuego[4].entregar();
		//Y devolvemos uno de los videojuegos anteriormente entregado.
		videojuego[4].devolver();
		System.out.println("");
		for(int i=0;i<5;i++) {
			if(serie[i].isEntregado()) {
				cuenta++;
				serie[i].devolver();
			}
		}
		System.out.println("");
		for(int i=0;i<5;i++) {
			if(videojuego[i].isEntregado()) {
				videojuego[i].devolver();
				cuenta++;
			}
		}
		System.out.println("Había "+cuenta+ " series y juegos entregados. Todos han sido devueltos\n");

		
		for (int i = 0; i < serie.length; i++) {
			System.out.println("Serie: "+serie[i].toString());
		}
		
				
		Arrays.sort(serie);
		//Arrays.sort(videojuego);
		for (int i = 0; i < serie.length; i++) {
			System.out.println("Serie: "+serie[i].toString());
		}
		/*for(int i=0;i<5;i++) {
			
		}*/



		//videojuego[].compareTo(videojuego[]);
		
		
	}
	
}
