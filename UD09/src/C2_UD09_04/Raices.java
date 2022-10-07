package C2_UD09_04;

public class Raices implements SegundoGrado {
	private double a;
	private double b;
	private double c;
    /**
     * Constructor 1
     * Asigna 0 a los atributos
     * a, b y c
     */
    public Raices() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    /**
     * Constructor 2
     * @param a 
     * @param b
     * @param c
     */
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /* Funciones y metodos de la aplicación */
	public double getDiscriminate(){
		
		return ((b*b)-(4*a*c));
		
	};
	public boolean tieneRaices(){
		return this.getDiscriminate()>0?true:false;
	};
	public boolean tieneRaiz(){
		return this.getDiscriminate()==0?true:false;
	};
	public void calcular(){
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		}
		else {System.out.println("Esta ecuación no tiene soluciones reales");}
	};
	public void obtenerRaices(){
		double solucion1=((-b+Math.sqrt(this.getDiscriminate()))/(2*a));
		double solucion2=((-b-Math.sqrt(this.getDiscriminate()))/(2*a));
		System.out.println("Esta ecuación tiene dos soluciones: "+solucion1+" y "+solucion2);
	};
	public void obtenerRaiz(){
		System.out.println("Esta ecuación tiene una única solución: "+(-b/(2*a)));
	};

}
