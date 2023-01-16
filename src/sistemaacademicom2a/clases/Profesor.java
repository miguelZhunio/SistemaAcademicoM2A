package sistemaacademicom2a.clases;

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
    public void Disponibilidad(String codigo) {
        
        if (true) {
            System.out.println("VERDADERO");
        }
    }    
    
}