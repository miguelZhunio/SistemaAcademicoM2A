package sistemaacademicom2a.colecciones;


import java.util.Scanner;
import sistemaacademicom2a.validaciones.*;
import sistemaacademicom2a.clases.*;

/**
 *
 * @author Zhunio Miguel
 */
public class Modificar {
    public static Scanner in = new Scanner(System.in);
    public static String auxString;
    public static boolean auxFloat;
    public static int auxInt;
    public static boolean auxBoolean;
    public static char auxChar;
    
    public static String opModificar;
    public static int opInt;
    
    public static Object auxObjecto = new Object();
    public static Alumno auxAlumno;
    public static Aula auxAula;
    public static Profesor auxProfesor;
    
    public static String AtributosPersona = "1. Cedula \n"
            + "2.Nombre \n"
            + "3. Apellido \n"
            + "4.Edad \n"
            + "5. Sexo \n"
            + "6. Asistencia \n"
            + "7. NumeroFaldas \n"
            + "8. Disponiblidad \n";  
    
    public static void ModificarInstancia(String op) {
        
        if (op.equalsIgnoreCase("3")) {    
            auxString = ValidarAtributos.ValidarCodigoAula();
            auxAula = (Aula) Consultar.ConsultarExistencia(auxString, op);
        } else if (op.equalsIgnoreCase("2")){
            auxString = ValidarAtributos.ValidarCedula();
            auxAlumno = (Alumno) Consultar.ConsultarExistencia(auxString, op);
        } else {
        }
        
  
        
        if (op.equalsIgnoreCase("1")) {
            
            auxString = ValidarAtributos.ValidarCedula();
            auxProfesor = (Profesor) Consultar.ConsultarExistencia(auxString, op);
            
            System.out.println("\n********** MODIFICAR DOCENTE **********\n");
            System.out.print(AtributosPersona + "9. Asignatura \n"
                    + "----> ");
            opModificar = in.next();
            
            opInt = Integer.valueOf(opModificar);
            
            switch(opInt) {
                case 1:
                   
                    
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
            }
        }
    }
}
