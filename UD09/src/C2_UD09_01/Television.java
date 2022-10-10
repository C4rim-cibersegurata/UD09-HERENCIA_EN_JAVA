package C2_UD09_01;

public class Television extends Electrodomestico {

	private double resolution = 20;
	private boolean tuner = false;
	
	public Television() {
		
		super();
		
		super.precioFinal();
		precioFinal();

	}

	public Television(double price, double weigth) {
		
		super(price, weigth);
		
		super.precioFinal();
		precioFinal();

	}

	public Television(double price, String color, char electricConsum, double weigth, double resolution, boolean tuner) {
		
		super(price, color, electricConsum, weigth);
		this.resolution = resolution;
		this.tuner = tuner;
		
		super.precioFinal();
		precioFinal();
		
	}

	public double getResolution() {
		return resolution;
	}

	public boolean isTuner() {
		return tuner;
	}

	public void precioFinal() {
		
		if (resolution>40) {
			
			this.price*=1.3;
			
		}
		
		if (tuner) {
			
			this.price+=50;
			
		}	
		
	}
	
}
