package C2_UD09_05;

import java.util.Random;
import java.util.Arrays;

public class Colegio {
	// iniciar aulas
	public static Aulas[] iniciarAulas() {
		Aulas[] aula = new Aulas[3];
		aula[0] = new Aulas(1, 14, "Física");
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
				"Josefina", "Miriam", "Pablo", "Fatima" };//los nombres de los alumnos se obtendrán de esta lista para usarlo en un For
		String sex;
		Estudiantes[] estudiante = new Estudiantes[noms.length];
		for (int i = 0; i < noms.length; i++) {//recorremos la lista de estudiantes y le asignamos el sexo, edad y nota de forma aleatoria
			if (rand.nextInt(3) == 0) {
				sex = "Hombre";
			} else if (rand.nextInt(3) == 1) {//para obtener el sexo de forma aleatoria asignamos una opcion por cada valor de la función random
				sex = "Mujer";		 //con el intervalo 0 a 2
			} else {
				sex = "Otro";
			}
			estudiante[i] = new Estudiantes(noms[i], (rand.nextInt(17 - 13) + 13), sex, (rand.nextInt(11)));
		}
		return estudiante;
	}

	public static void mostrarAulas(Profesor profes, Aulas aula, Estudiantes estudiantes[]) {
		// mostramos el nombre de la clase y el profesor que la imparte
		// entonces creamos un For por cada genero con un If que compruebe la nota
		// y otro que compruebe el genero para imprimir nombre y nota del alumno
		System.out.println("--------------------------------------------------");
		System.out.println("Hoy hay clase de " + aula.getMateria() + " con " + profes.getNombre());
		System.out.println("--------------------------------------------------");
		System.out.println("                    Alumnos                       ");
		System.out.println("Hombres aprobados: ");
		for (int i = 0; i < aula.getMaxEstudiantes(); i++) {// para hombres
			if (estudiantes[i].getSexo().equalsIgnoreCase("hombre") && estudiantes[i].getNota() >= 5) {
				System.out.println(estudiantes[i].getNombre() + " de " + estudiantes[i].getEdad() + " años tiene un "
						+ estudiantes[i].getNota());
			}
		}
		System.out.println("\nMujeres aprobadas: ");
		for (int i = 0; i < aula.getMaxEstudiantes(); i++) {// para mujeres
			if (estudiantes[i].getSexo().equalsIgnoreCase("Mujer") && estudiantes[i].getNota() >= 5) {
				System.out.println(estudiantes[i].getNombre() + " de " + estudiantes[i].getEdad() + " años tiene un "
						+ estudiantes[i].getNota());
			}
		}
		System.out.println("\nOtros aprobados: ");
		for (int i = 0; i < aula.getMaxEstudiantes(); i++) {// para otros
			if (estudiantes[i].getSexo().equalsIgnoreCase("otro") && estudiantes[i].getNota() >= 5) {
				System.out.println(estudiantes[i].getNombre() + " de " + estudiantes[i].getEdad() + " años tiene un "
						+ estudiantes[i].getNota());
			}
		}
		System.out.println("--------------------------------------------------");
	}

	public static void claseHoy(Profesor profes[], Aulas aula[], Estudiantes estudiantes[]) {
		// Profesor objProf = new Profesor();
		for (int i = 0; i < iniciarProfes().length; i++) {
			for (int j = 0; j < iniciarAulas().length; j++) {
				if (profes[i].toString().contains(aula[j].getMateria())) {// comprobamos si la materia que se da en esta aula y la que imparte el profesor
											 // es la misma usando un indexOf

					if (!aula[j].hayClase(profes[i], estudiantes)) {//llamamos al metodo hayClase para comprobar si el profesor
										       //y la suficiente cantidad de alumnos han asistido
						mostrarAulas(profes[i], aula[j], estudiantes);
					} else {
						System.out.println("Hoy no hay clases de " + profes[i].getMateria());
					}
				}
			}
		}
	};

}
