package C2_UD09_01;

public class Lavadora extends Electrodomestico {

	private double carga = 5;

	public Lavadora() {
		
		super();
		
		super.precioFinal();
		precioFinal();
		
	}
	
	public Lavadora(double price, double weigth) {
		
		super(price, weigth);
		
		super.precioFinal();
		precioFinal();
		
	}

	public Lavadora(double price, String color, char electricConsum, double weigth, double carga) {
		
		super(price, color, electricConsum, weigth);
		this.carga = carga;
		
		super.precioFinal();
		precioFinal();
		
	}

	public double getCarga() {
		return carga;
	}
	
	public void precioFinal() {
		
		if (carga>30) {
			
			price+=50;
			
		}
		
	}
	
}
