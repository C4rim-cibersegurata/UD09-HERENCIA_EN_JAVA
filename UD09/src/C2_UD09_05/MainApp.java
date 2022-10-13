package C2_UD09_05;

public class MainApp {

	public static void main(String[] args) {
		/*
		 * crear un objeto aula metodo que pasando todos los valores anteriores diga si
		 * hay clase o no. Escogemos la aula(clase) que toca con random o el calendario.
		 * entonces comprobamos si el profesor concuerda con la clase metodo
		 * asistencia() metodo crear aulas con id
		 */
		Aulas[] aulas = Colegio.iniciarAulas();
		Profesor[] profes = Colegio.iniciarProfes();
		Estudiantes[] estudiante = Colegio.iniciarEstudiantes();
		Colegio.claseHoy(profes,aulas,estudiante);
	}

}
