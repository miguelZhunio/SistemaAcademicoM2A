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
            alumnoIngresado = ValidarAtributos.ValidarEstudiante();
            ListadoEstudiantil.add(alumnoIngresado);
            
            System.out.print("Ingresar otro alumno \n 1. SI \n2. NO \n---> ");
            op = in.next();
            
           error = ValidarRangoNumericos.Rango1a2(op);
            
            
        } while (op.equalsIgnoreCase("1"));
            
        
    }
    public void GenerarReporteEstudianteAula() {
        System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n",
                    "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "ASISTENCIA", "FALTAS", "NOTA"
        );
        for (int i = 0; i < ListadoEstudiantil.size(); i++) {
                
            System.out.printf("%5d|%14s|%14s|%14s|%14d|%14c|%14b|%14d|%18d|%n", 
                (i+1),
                ListadoEstudiantil.get(i).getCedula(),
                ListadoEstudiantil.get(i).getNombre(),
                ListadoEstudiantil.get(i).getApellido(),
                ListadoEstudiantil.get(i).getEdad(),
                ListadoEstudiantil.get(i).getSexo(),
                ListadoEstudiantil.get(i).isAsistencia(),
                ListadoEstudiantil.get(i).getNumeroFaltas(),
                ListadoEstudiantil.get(i).getNota() 
            );
        }
    }
    
    public void ImpartirClase() {
        if ((!miProfesor.isDisponibilidad())) {
            System.out.println("NO SE PUEDE IMPARTIR CLASE  DISPONIBILIDAD DEL PROFESOR --->" + miProfesor.isDisponibilidad());
        } else {
            if (!(ListadoEstudiantil.size() > (MAX_ESTUDIANTES/2))) {
                System.out.println("NO SE PUEDE IMPARTI CLASE DEBIDO AL AFORO DE ESTUDIANTE ---> " + ListadoEstudiantil.size());
            } else {
                EnListarAlumnoAprobado();
            }
            
        }
        
    }
    
    public void EnListarAlumnoAprobado() {
        int mujeresAprobadas = 0, hombresAprobados = 0;
        int mujeresNoAprobadas = 0, hombresNoAprobados = 0;
        for (int i = 0; i < ListadoEstudiantil.size(); i++) {
            if (ListadoEstudiantil.get(i).getSexo() == 'F') {
                if (ListadoEstudiantil.get(i).getNota() > 7 ) {
                    mujeresAprobadas+=1;
                } else {
                    mujeresNoAprobadas += 1;
                }
            } else {
                if (ListadoEstudiantil.get(i).getNota() > 7 ) {
                    hombresAprobados+=1;
                } else {
                    hombresNoAprobados += 1;
                }
            }
        }
        
        System.out.printf("%18s|%18s|%18s|%18s|%n", "MUJERES APROBADAS" , "HOMBRES APROBADOS" , "MUJERES NO APROBADAS", "HOMBRES NO APRBADOS\n");
        System.out.printf("%18s|%18s|%18s|%18s|%n", mujeresAprobadas, hombresAprobados, mujeresNoAprobadas, hombresNoAprobados);
        
    }
    
}
