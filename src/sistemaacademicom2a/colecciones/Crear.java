package sistemaacademicom2a.colecciones;

import java.util.Scanner;
import sistemaacademicom2a.clases.*;
import sistemaacademicom2a.impresiones.Menu;
import sistemaacademicom2a.impresiones.SubMenu;
import sistemaacademicom2a.validaciones.*;
import sistemaacademicom2a.principal.*;


/**
 *
 * @author Zhunio Miguel
 */
public class Crear {
    private static boolean error = true;
    private static Scanner in = new Scanner(System.in);
    private static String opc;
    private static String[] args = new String[2];
 
    
    public static void CrearInstancias(String op) {
        // Declaracion de las instancias de las clases
        Alumno nuevoAlumno;
        Aula nuevaAula;
        Profesor nuevoProfesor;
        
         // Variable que ayuda en el menu luego de crear.
        
        // Variables auxiliares
        String auxString;
        int auxInt;
        char auxChar;
        
        if (op.equals("1")) {
            nuevoProfesor = new Profesor();
                
            auxString = ValidarAtributos.ValidarCedula();
            nuevoProfesor.setCedula(auxString);
            auxString = ValidarAtributos.ValidarNombre();
            nuevoProfesor.setNombre(auxString);
            auxString = ValidarAtributos.ValidarApellido();
            nuevoProfesor.setApellido(auxString);
            auxInt = ValidarAtributos.ValidarEdadProfesor();
            nuevoProfesor.setEdad(auxInt);
            auxChar = ValidarAtributos.ValidarSexo();
            nuevoProfesor.setSexo(auxChar);
            auxString = ValidarAtributos.ValidarAsignatura();
            nuevoProfesor.setMateria(auxString);
            
              
            Colecciones.ListadoDeProfesores.add(nuevoProfesor); 
            Consultar.ConsultarExistencia(nuevoProfesor.getCedula(), op);               
            Opciones(op);
            
        }
        
        if (op.equals("2")) {
            nuevoAlumno = new Alumno();
            auxString = ValidarAtributos.ValidarCedula();
            nuevoAlumno.setCedula(auxString);
            auxString = ValidarAtributos.ValidarNombre();
            nuevoAlumno.setNombre(auxString);
            auxString = ValidarAtributos.ValidarApellido();
            nuevoAlumno.setApellido(auxString);
            auxInt = ValidarAtributos.ValidarEdadAlumno();
            nuevoAlumno.setEdad(auxInt);
            auxChar = ValidarAtributos.ValidarSexo();
            nuevoAlumno.setSexo(auxChar);
            
            Colecciones.ListadoEstudiantilGeneral.add(nuevoAlumno); 
            Consultar.ConsultarExistencia(nuevoAlumno.getCedula(), op);
            
            Opciones(op);
        }
        
        if (op.equals("3")) {
            nuevaAula = new Aula();
            auxString = ValidarAtributos.ValidarCodigoAula();
            nuevaAula.setCodigo(op);
            nuevoProfesor = ValidarAtributos.ValidarProfesor();
            nuevaAula.setMiProfesor( nuevoProfesor);
            nuevaAula.InsertarAlumnoAula();
   
            Colecciones.ListadoDeAulas.add(nuevaAula); 
            Consultar.ConsultarExistencia(nuevaAula.getCodigo(), op);
                
            Opciones(op);
        }
    }
    
    
    public static void Opciones(String op) {
        
        do {
            System.out.println("\nDigite: \n"
                        + "1 ---> Volver al menu principal \n"
                        + "2 ---> Crear otro objeto\n"
                        + "3 --->  Salir");
                opc = in.next();
                ValidarRangoNumericos.Rango1a3(opc);
        } while (!error);
        
        
        if (opc.equals("1")) { SistemaAcademicoM2A.main(args); }
        
        if (opc.equals("2")) { CrearInstancias(op); }
        
        if (opc.equals("3")) { System.exit(0); }
    }
    
    
}
