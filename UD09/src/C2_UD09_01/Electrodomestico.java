package C2_UD09_01;

public class Electrodomestico {

	protected double price;
	private String color;
	private char electricConsum;
	private double weigth;
	
	public Electrodomestico() {
		
		setPrice();
		setColor();
		setElectricConsum();
		setWeigth();
		
		precioFinal();
		
	}
	
	public Electrodomestico(double price, double weigth) {
		
		this.price = price;
		setColor();
		setElectricConsum();
		this.weigth = weigth;
		
		precioFinal();
		
	}
	
	public Electrodomestico(double price, String color, char electricConsum, double weigth) {
		
		this.price = price;
		comporbarColor(color);
		comprobarConsumoEnergetico(electricConsum);
		this.weigth = weigth;
		
		precioFinal();
		
	}

	public void setPrice() {
		
		this.price = 100;
		
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
		
		double tamano = (int)this.weigth;
		
		if (tamano < 20) {
			
			precioExtra += 10;
			
		} else if (tamano < 50) {
			
			precioExtra += 50;
			
		} else if (tamano < 80) {
			
			precioExtra += 80;
			
		} else {
			
			precioExtra += 100;
			
		}
			
		this.price += precioExtra;
		
	}

	public void setColor() {
		
		this.color = "blanco";
		
	}
	
	public void comporbarColor(String color) {
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
		
			this.color = color.toLowerCase();
		
		} else {
			
			setColor();
			
		}
		
	}

	public void setElectricConsum() {
		
		this.electricConsum = 'F';
		
	}
	
	public void comprobarConsumoEnergetico(char electricConsum) {
		
		if (((int)electricConsum >= 65 && (int)electricConsum <= 70)) {
			
			this.electricConsum = electricConsum;
			
		} else {
			
			setElectricConsum();
			
		}
		
	}

	public void setWeigth() {
		this.weigth = 5;
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
