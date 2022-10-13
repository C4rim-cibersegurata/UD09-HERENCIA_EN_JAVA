package C2_UD09_05;
import java.util.Random; 
public class Profesor extends ListaAsistencia {
	public String nombre;
    public int edad;
    public String sexo;
    public String materia;
    /**
     * Constructor 1 atributos
     */
    public Profesor() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = "";
        this.materia = "";
    }
    /**
     * Constructor 2
     * @param id 
     * @param MaxEstudiantes
     * @param materia
     */
    public Profesor(String nombre, int edad, String sexo, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.materia = materia;
    }
    
    @Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", materia=" + materia + "]";
	}
	public String getMateria() {
		return materia;
	}
	public boolean asistencia() {//probabilidad del 20% de faltar a clase
        Random rand = new Random(); 	
        return rand.nextInt(100)>=20?true:false;
	}
}
