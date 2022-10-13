package C2_UD09_05;

import java.util.Random;
import java.util.Arrays;

public class Colegio {
	// iniciar aulas
	public static Aulas[] iniciarAulas() {
		Aulas[] aula = new Aulas[3];
		aula[0] = new Aulas(1, 15, "Física");
		aula[1] = new Aulas(2, 10, "Filosofía");
		aula[2] = new Aulas(3, 8, "Matemáticas");
		return aula;
	}

	// iniciar profes
	public static Profesor[] iniciarProfes() {
		Profesor[] profe = new Profesor[3];
		profe[0] = new Profesor("Pere", 27, "Hombre", "Física");
		profe[1] = new Profesor("Sanmi", 34, "Hombre", "Filosofía");
		profe[2] = new Profesor("Pep", 42, "Hombre", "Matemáticas");
		return profe;
	}

	// iniciar alumnos
	public static Estudiantes[] iniciarEstudiantes() {
		Random rand = new Random();
		String[] noms = { "Juan", "Jaime", "Pedro", "Isma", "Andrés", "Laura", "Marta", "Leonardo", "Laia", "Ariadna",
				"Josefina", "Miriam", "Pablo", "Fatima" };
		String sex;
		Estudiantes[] estudiante = new Estudiantes[noms.length];
		for (int i = 0; i < noms.length; i++) {
			if (rand.nextInt(2) == 0) {
				sex = "Hombre";
			} else {
				sex = "Mujer";
			}
			estudiante[i] = new Estudiantes(noms[i], (rand.nextInt(17 - 13) + 13), sex, (rand.nextInt(11)));
		}
		return estudiante;
	}
	

	public static void claseHoy(Profesor profes[], Aulas aula[], Estudiantes estudiantes[]) {
		Profesor objProf = new Profesor();
		for (int i = 0; i < iniciarProfes().length; i++) {
			for (int j = 0; j < iniciarAulas().length; j++) {
				if (objProf.asistencia()) {
					//System.out.println("Hoy hay clase de ");
					if (profes[i].toString().contains(aula[j].getMateria())) {//index of para ver si el getmateria de aulas esta en el toString de profes
						if (aula[j].hayClase(profes[i], estudiantes)) {
							System.out.println(profes[i].toString()+"  "+aula[j].getMateria());
						} else {
							System.out.println("No hay clases de ");
						}
					}
				}
			}
		}
	};

}
