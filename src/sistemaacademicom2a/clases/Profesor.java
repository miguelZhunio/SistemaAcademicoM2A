package sistemaacademicom2a.clases;

import sistemaacademicom2a.colecciones.Colecciones;
import sistemaacademicom2a.colecciones.Consultar;

/**
 *
 * @author Zhunio Miguel
 */
public class Profesor extends Persona{
    
    //atributos
    private String materia;
    
    // constructores
    public Profesor() {
        super();
    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(String materia, String cedula, String nombre, String apellido, int edad, char sexo, int numeroFaltas, boolean disponiblidad) {
        super(cedula, nombre, apellido, edad, sexo, numeroFaltas, disponiblidad);
        this.materia = materia;
    }
    
    //setter
    public void setMateria(String materia) { this.materia = materia;}
    
    //getter
    public String getMateria() { return materia;}
    
    
    // metodo codificado
    @Override
    public void Disponibilidad() { 
        int indice = Consultar.ConsultarIndice(this.getCedula(), "1");    
        if (Colecciones.ListadoDeProfesores.get(indice).getNumeroFaltas() > (getDIASTRABAJADOS() * 0.25)) {
            System.out.println("ESTUDIANTE" + Colecciones.ListadoDeProfesores.get(indice).getNombre() + " tiene " +
                    Colecciones.ListadoDeProfesores.get(indice).getNumeroFaltas());
            Colecciones.ListadoDeProfesores.get(indice).setDisponibilidad(false);
        }  

    }    
    
}