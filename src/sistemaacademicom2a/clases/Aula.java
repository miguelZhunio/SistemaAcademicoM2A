package sistemaacademicom2a.clases;

import java.util.ArrayList;

/**
 *
 * @author Zhunio Miguel
 */
public class Aula {
    
    // metodos
    private String codigo;
    private Profesor miProfesor;
    public ArrayList<Alumno> ListadoEstudiantil = new ArrayList<>();
    
    // constantes
    private final int MAX_ESTUDIANTES = 20;
    
    // constructores
    public Aula() {
    }

    public Aula(String codigo, Profesor miProfesor) {
        this.codigo = codigo;
        this.miProfesor = miProfesor;
    }
    
    // setter
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMiProfesor(Profesor miProfesor) {
        this.miProfesor = miProfesor;
    }
    
    // getter
    public String getCodigo() {
        return codigo;
    }

    public Profesor getMiProfesor() {
        return miProfesor;
    }

    public int getMAX_ESTUDIANTES() {
        return MAX_ESTUDIANTES;
    }
    
    // Ingresar estudiantes al aula.
    public void InsertarAlumnoAula() {
        
    }
    
}
