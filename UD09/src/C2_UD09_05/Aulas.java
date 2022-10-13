package C2_UD09_05;

public class Aulas {
	public int id;
	public int MaxEstudiantes;
	public String materia;

	/**
	 * Constructor 1 atributos
	 */
	public Aulas() {
		this.id = 0;
		this.MaxEstudiantes = 0;
		this.materia = "";
	}

	/**
	 * Constructor 2
	 * 
	 * @param id
	 * @param MaxEstudiantes
	 * @param materia
	 */
	public Aulas(int id, int MaxEstudiantes, String materia) {
		this.id = id;
		this.MaxEstudiantes = MaxEstudiantes;
		this.materia = materia;

	}

	@Override
	public String toString() {
		return "Aulas [id=" + id + ", MaxEstudiantes=" + MaxEstudiantes + ", materia=" + materia + "]";
	}

	public int getIdAula() {// metodos get para devolver los valores de id, materia y MaxEstudiantes
		return id;
	}

	public String getMateria() {
		return materia;
	}

	public int getMaxEstudiantes() {
		return MaxEstudiantes;
	}
	public boolean hayClase(Profesor profe, Estudiantes[] estudiantes) {
		//if profe ha asistido, pasamos estudiantes  i con un for comprovamos por cada alumno si asistió
		boolean asistenciaHoy=false;
		if (profe.asistencia()) {
			int alumnosPresentes = 0;
			for(Estudiantes al : estudiantes) {
				if(al.asistencia()==true)
					alumnosPresentes++;
			}
			int porcentajePresentes = alumnosPresentes*100/this.MaxEstudiantes;
			if(porcentajePresentes>=50) {asistenciaHoy=true;}
		} else {asistenciaHoy=true;}
		return asistenciaHoy;
		}
}
