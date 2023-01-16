package sistemaacademicom2a.clases;

import java.util.ArrayList;
import java.util.Scanner;
import sistemaacademicom2a.colecciones.Mostrar;
import sistemaacademicom2a.validaciones.ValidarAtributos;
import sistemaacademicom2a.validaciones.ValidarRangoNumericos;

/**
 *
 * @author Zhunio Miguel
 */
public class Aula {
    
    // metodos
    private String codigo;
    private Profesor miProfesor;
    public String materiaDada;
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

    public void setMateriaDada(String materiaDada) {
        this.materiaDada = materiaDada;
    }

    public void setListadoEstudiantil(ArrayList<Alumno> ListadoEstudiantil) {
        this.ListadoEstudiantil = ListadoEstudiantil;
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

    public String getMateriaDada() {
        return materiaDada;
    }

    public ArrayList<Alumno> getListadoEstudiantil() {
        return ListadoEstudiantil;
    }
   
    // Ingresar estudiantes al aula.
    public void InsertarAlumnoAula() {
        Scanner in = new Scanner(System.in);
        String op;
        boolean error = true;
        Alumno alumnoIngresado;
        
        do {
            alumnoIngresado = (Alumno) ValidarAtributos.ValidarEstudiante();
            ListadoEstudiantil.add(alumnoIngresado);
            
            System.out.println("Ingresar otro alumno \n 1. SI \n2. NO \n---> ");
            op = in.next();
            
           error = ValidarRangoNumericos.Rango1a2(op);
            
            
        } while (op.equalsIgnoreCase("1"));
            
        
    }
    
}
