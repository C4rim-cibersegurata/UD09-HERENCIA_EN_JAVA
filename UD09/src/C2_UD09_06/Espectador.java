package C2_UD09_06;

public class Espectador {

	//Atributos
	private String name;
	private int age;
	private double money;
	
	//Constructores
	public Espectador(String name, int age, double money) {
		
		this.name = name;
		this.age = age;
		this.money = money;
		
	}

	//Metodos
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getMoney() {
		return money;
	}
	
	//Esta escrito de esta manera para que sea más entendible en el main
	@Override
	public String toString() {
		
		return " " + name + ", " + age + " años, " + money + "€,";
		
	}
	
	
	
}
