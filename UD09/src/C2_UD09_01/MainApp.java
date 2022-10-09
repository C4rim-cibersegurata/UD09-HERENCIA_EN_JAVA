package C2_UD09_01;

public class MainApp {

	public static void main(String[] args) {
		
		Electrodomestico array[] = new Electrodomestico[10];
			
		array[0] = new Electrodomestico(); // 120 Done
		array[1] = new Electrodomestico(200, 23); //260 Done
		array[2] = new Electrodomestico(300, "azul", 'C', 23); //410 Done
		array[3] = new Lavadora(); // 120 Done
		array[4] = new Lavadora(300, 16); // 320 Done
		array[5] = new Lavadora(400, "blanco", 'D', 23, 21); // 500 Done
		array[6] = new Television(); // 120 Done
		array[7] = new Television(500, 4); // 520 Done
		array[8] = new Television(400, "Negro", 'F', 9, 30, true); // 470 Done
		array[9] = new Television(240, "NeGro", 'B', 8, 29, false); // 330 Done

		double sumaTotal = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Electrodomestico " + (i+1) + ": " + array[i].getPrice());
			sumaTotal += array[i].getPrice();
			
		}
		
		System.out.println("Suma total de todos los electrodomesticos: " + sumaTotal);
		
		
	}

}
