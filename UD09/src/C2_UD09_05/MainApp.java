package C2_UD09_05;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * Programa para representar una aula con un profesor y sus estudiantes
		 * El objetivo es mostrar los alumnos aprobados separados por genero para las clases 
		 * que se dan en cada ejecución
		 */
		Aulas[] aulas = Colegio.iniciarAulas();//inicializamos la aula, los profesores y los estudiantes
		Profesor[] profes = Colegio.iniciarProfes();
		Estudiantes[] estudiante = Colegio.iniciarEstudiantes();
		Colegio.claseHoy(profes, aulas, estudiante);
	}

}
