package C2_UD09_06;

public class Sala {

	//Atributos
	//Se asigna esta constante para elegir asiento más adelante
	private final String columnasAsientos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private boolean asientos[][];
	
	//Constructores
	//Si no pone nada dejo el constructor con el tamaño de ejemplo del enunciado
	public Sala() {
		
		asientos = new boolean[8][9];
		
	}
	
	public Sala(int filas, int columnas) {
		
		asientos = new boolean[filas][columnas];
		
	}
	
	//Los boolean devuelven false por defecto, asi que comprobaremos si esta ocupado
	protected boolean isOcupatedAll() {
		
		for (int i = 0; i < asientos.length; i++) {
			
			for (int j = 0; j < asientos[i].length; j++) {
				
				//Si encuenta un asiento libre saldrá de aqui
				if (!asientos[i][j]) {
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}
	
	//Como el enunciado pone que sea aleatorio el sitio donde sentar a los espectadores,
	//no hemos agarrado los valores del método anterior
	protected void getAsiento() {
		
		//No sale hasta que tenga un valor asignado
		boolean asientoAsignado = false;
		
		
		int longitud = (asientos.length - 1) * asientos[0].length;
		
		do {
			
			int num = (int)Math.floor(Math.random() * (longitud));
			
			//Si el condicional da false, es decir que no esta ocupado entramos
			if (!asientos[num/asientos.length][num%asientos[0].length]) {
				
				//Cambiamos el valor del asiento para que no se repita
				asientos[num/asientos.length][num%asientos[0].length] = true;
				
				//Salimos del buvle
				asientoAsignado = true;
				
				//Mostramos el asiento
				System.out.println("El asiento para el espectador es " + (num/asientos.length) + (columnasAsientos.charAt(num%asientos[0].length)));
				
			}
			
		} while (!asientoAsignado);
		
	}
	
}
