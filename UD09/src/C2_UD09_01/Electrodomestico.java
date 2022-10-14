package C2_UD09_01;

public class Electrodomestico implements HomeAppliancable {

	protected double price = 100;
	private String color = "white";
	private char electricConsum = 'F';
	private double weigth = 5;
	private final String electricConsumChain = "ABCDEF";
	
	public Electrodomestico() {
		
		precioFinal();
		
	}
	
	public Electrodomestico(double price, double weigth) {
		
		this.price = price;
		this.weigth = weigth;
		
		precioFinal();
		
	}
	
	public Electrodomestico(double price, String color, char electricConsum, double weigth) {
		
		this.price = price;
		comprobarColor(color);
		comprobarConsumoEnergetico(electricConsum);
		this.weigth = weigth;
		
		precioFinal();
		
	}
	
	public void precioFinal() {
		
		char letra = this.electricConsum;
		int precioExtra = 0;
		
		switch (letra) {
		
			case 'A':
				precioExtra += 100;
				break;
			case 'B':
				precioExtra += 80;
				break;
			case 'C':
				precioExtra += 60;
				break;
			case 'D':
				precioExtra += 50;
				break;
			case 'E':
				precioExtra += 30;
				break;
			case 'F':
				precioExtra += 10;
				break;
			default:
				break;
				
		}
		
		double peso = (int)this.weigth;
		
		if (peso < 20) {
			
			precioExtra += 10;
			
		} else if (peso < 50) {
			
			precioExtra += 50;
			
		} else if (peso < 80) {
			
			precioExtra += 80;
			
		} else {
			
			precioExtra += 100;
			
		}
			
		this.price += precioExtra;
		
	}
	
	public void comprobarColor(String color) {
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
		
			this.color = color.toLowerCase();
		
		} 
		
	}
	
	public void comprobarConsumoEnergetico(char electricConsum) {
		
		if (electricConsumChain.matches(electricConsumChain)) {
			
			this.electricConsum = electricConsum;
			
		}
		
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public char getElectricConsum() {
		return electricConsum;
	}

	public double getWeigth() {
		return weigth;
	}

	@Override
	public String toString() {
		return "Electrodomestico [price=" + price + "€, color=" + color + ", electricConsum=" + electricConsum
				+ ", weigth=" + weigth + "kg]";
	}
	
}
