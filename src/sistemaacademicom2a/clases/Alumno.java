package sistemaacademicom2a.clases;

/**
 *
 * @author Zhunio Miguel
 */
public class Alumno extends Persona{
    
    // metodos
    private int nota;
    
    // constructores
    public Alumno() {
        super();
    }

    public Alumno(int nota) {
        this.nota = nota;
    }

    public Alumno(int nota, String cedula, String nombre, String apellido, int edad, char sexo, int numeroFaltas, boolean disponiblidad) {
        super(cedula, nombre, apellido, edad, sexo, numeroFaltas, disponiblidad);
        this.nota = nota;
    }

    
    // setter
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    // getter
    public int getNota() {
        return nota;
    }
    
    @Override
    public void Disponibilidad(String codigo) {
        
    }
    
    
    
}
