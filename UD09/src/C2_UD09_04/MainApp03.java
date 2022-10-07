package C2_UD09_04;

public class MainApp03 {
	public static void main(String [] args) {
	Libro libro[]=new Libro[2];
	libro[0]=new Libro("9785878468124","El nombre del viento","Patrick Rothfuss",873);
	libro[1]=new Libro("9453615842547","Misery","Stephen King",400);
	
		for(int i=0;i<2;i++) {
			System.out.println(libro[i].toString());
		}
	}
}


