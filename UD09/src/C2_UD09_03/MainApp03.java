package C2_UD09_03;

public class MainApp03 {
	public static void main(String [] args) {
	Libro libro[]=new Libro[2];
	libro[0]=new Libro("9785878468124","El nombre del viento","Patrick Rothfuss",873);
	libro[1]=new Libro("9453615842547","Misery","Stephen King",400);
	int i=0;
	
		//Imprimimos la información de todos los libros.
		for(i=0;i<2;i++) {
			System.out.println(libro[i].toString());
		}
		

		//Indicamos que libro tiene más páginas
			if(libro[0].getNumPaginas()<libro[1].getNumPaginas()) {
				System.out.println(" "+libro[1].getTitulo()+" con "+libro[1].getNumPaginas()+" paginas tiene más que "
			+libro[0].getTitulo()+ ", que tiene "+libro[0].getNumPaginas()+ " paginas");
			}else {
				System.out.println(" "+libro[0].getTitulo()+" con "+libro[0].getNumPaginas()+" paginas tiene más que "
						+libro[1].getTitulo()+ ", que tiene "+libro[1].getNumPaginas()+ " paginas");
			}
	}
}


