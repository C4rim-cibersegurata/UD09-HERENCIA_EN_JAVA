package C2_UD09_05;

import java.util.Random;

public class Estudiantes extends ListaAsistencia {
	public String nombre;
	public int edad;
	public String sexo;
	public int nota;

	/**
	 * Constructor 1 atributos
	 */
	public Estudiantes() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = "";
		this.nota = 0;
	}

	/**
	 * Constructor 2
	 * 
	 * @param id
	 * @param MaxEstudiantes
	 * @param materia
	 */
	public Estudiantes(String nombre, int edad, String sexo, int nota) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.nota = nota;

	}

	
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public String getSexo() {
		return sexo;
	}


	public int getNota() {
		return nota;
	}

	public boolean asistencia() {// probabilidad del 50% de faltar a clase
		Random rand = new Random();
		return rand.nextInt(100) >= 50 ? true : false;
	}
}
