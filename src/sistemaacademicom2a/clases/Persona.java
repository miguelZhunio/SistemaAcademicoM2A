package sistemaacademicom2a.clases;

public abstract class Persona {
    
    // Atributos 
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private boolean Asistencia;
    private int numeroFaltas;
    
    // Constante
    private final int DIASTRABAJADOS = 100;
    
    // constructores
    public Persona() {
        
    }

    public Persona(String cedula, String nombre, String apellido, int edad, char sexo, boolean Asistencia, int numeroFaltas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.Asistencia = Asistencia;
        this.numeroFaltas = numeroFaltas;
    }
    
    // setter
    public void setCedula(String cedula) { this.cedula = cedula;}

    public void setNombre(String nombre) { this.nombre = nombre;}

    public void setApellido(String apellido) { this.apellido = apellido;}

    public void setEdad(int edad) { this.edad = edad;}

    public void setSexo(char sexo) { this.sexo = sexo;}

    public void setAsistencia(boolean Asistencia) { this.Asistencia = Asistencia;}

    public void setNumeroFaltas(int numeroFaltas) { this.numeroFaltas = numeroFaltas;}
    
    //getter
    public String getCedula() { return cedula;}

    public String getNombre() { return nombre;}

    public String getApellido() { return apellido;}

    public int getEdad() { return edad;}

    public char getSexo() { return sexo;}

    public boolean isAsistencia() { return Asistencia;}

    public int getNumeroFaltas() { return numeroFaltas;}

    public int getDIASTRABAJADOS() { return DIASTRABAJADOS;}
    
    // toString
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + ", Asistencia=" + Asistencia + ", numeroFaltas=" + numeroFaltas + '}';
    }
    
    // metodo polimorfismo.
    public abstract void Disponibilidad(String codigo);   
    
}