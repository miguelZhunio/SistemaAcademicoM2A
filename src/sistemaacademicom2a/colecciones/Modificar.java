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
    
    public static int indice;
    
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
            auxBoolean = Consultar.ConsultarSiExiste(auxString, op);
        } else {
            auxString = ValidarAtributos.ValidarCedula();
            auxBoolean = Consultar.ConsultarSiExiste(auxString, op);
        } 
           
            
        
  
        
        if (op.equalsIgnoreCase("1") && auxBoolean == true) {
            
            indice = Consultar.ConsultarIndice(auxString, op);
            
            do {
                System.out.println("\n********** MODIFICAR DOCENTE **********\n");
                System.out.print(AtributosPersona + "9. Asignatura \n"
                     + "----> ");
                opModificar = in.next();
            auxBoolean = ValidarRangoNumericos.Rango1a9(opModificar);
                
            } while(!auxBoolean);
                        
             opInt = Integer.valueOf(opModificar);
            
            
            switch(opInt) {
                case 1:
                    auxString = ValidarAtributos.ValidarCedula();
                    Colecciones.ListadoDeProfesores.get(indice).setCedula(auxString);
                    break;
                case 2:
                    auxString = ValidarAtributos.ValidarNombre();
                    Colecciones.ListadoDeProfesores.get(indice).setNombre(auxString);
                    break;
                case 3:
                    auxString = ValidarAtributos.ValidarApellido();
                    Colecciones.ListadoDeProfesores.get(indice).setApellido(auxString);
                    break;
                case 4:
                    auxInt = ValidarAtributos.ValidarEdadProfesor();
                    Colecciones.ListadoDeProfesores.get(indice).setEdad(auxInt);
                    break;
                case 5:
                    auxChar = ValidarAtributos.ValidarSexo();
                    Colecciones.ListadoDeProfesores.get(indice).setSexo(auxChar);
                    break;
                case 6:
                    auxBoolean = ValidarAtributos.ValidarAsistencia();
                    Colecciones.ListadoDeProfesores.get(indice).setAsistencia(auxBoolean);
                    break;
                case 7:
                    System.out.println("Faltas ---> " + Colecciones.ListadoDeProfesores.get(indice).getNumeroFaltas());
                    System.out.print("Cuantas flatas desea eliminar ----> ");
                    auxString = in.next();
                    
                    auxBoolean = ValidarRangoNumericos.Rango1aN(auxString);
                    
                    if (auxBoolean) { 
                        auxInt = Integer.valueOf(auxString);
                        Colecciones.ListadoDeProfesores.get(indice).setNumeroFaltas(-auxInt);

                    }
                   break; 
                case 8:
                    auxBoolean = ValidarAtributos.ValidarAsistencia();
                    Colecciones.ListadoDeProfesores.get(indice).setDisponibilidad(auxBoolean);
                    break;
                case 9:
                    auxString = ValidarAtributos.ValidarAsignatura();
                    Colecciones.ListadoDeProfesores.get(indice).setMateria(auxString);
                    break;
                    
            }
        }
        
        if (op.equalsIgnoreCase("2") && auxBoolean == true) {
            indice = Consultar.ConsultarIndice(auxString, op);
            
            do {
                System.out.println("\n********** MODIFICAR ESTUDIANTE **********\n");
                System.out.print(AtributosPersona + "9. Nota \n"
                     + "----> ");
                opModificar = in.next();
                auxBoolean = ValidarRangoNumericos.Rango1a9(opModificar);
                
            } while(!auxBoolean);
                        
             opInt = Integer.valueOf(opModificar);
            
            
            switch(opInt) {
                case 1:
                    auxString = ValidarAtributos.ValidarCedula();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setCedula(auxString);
                    break;
                case 2:
                    auxString = ValidarAtributos.ValidarNombre();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setNombre(auxString);
                    break;
                case 3:
                    auxString = ValidarAtributos.ValidarApellido();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setApellido(auxString);
                    break;
                case 4:
                    auxInt = ValidarAtributos.ValidarEdadProfesor();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setEdad(auxInt);
                    break;
                case 5:
                    auxChar = ValidarAtributos.ValidarSexo();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setSexo(auxChar);
                    break;
                case 6:
                    auxBoolean = ValidarAtributos.ValidarAsistencia();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setAsistencia(auxBoolean);
                    break;
                case 7:
                    System.out.println("Faltas ---> " + Colecciones.ListadoDeProfesores.get(indice).getNumeroFaltas());
                    System.out.print("Cuantas flatas desea eliminar ----> ");
                    auxString = in.next();
                    
                    auxBoolean = ValidarRangoNumericos.Rango1aN(auxString);
                    
                    if (auxBoolean) { 
                        auxInt = Integer.valueOf(auxString);
                        Colecciones.ListadoEstudiantilGeneral.get(indice).setNumeroFaltas(-auxInt);

                    }
                   break; 
                case 8:
                    auxBoolean = ValidarAtributos.ValidarAsistencia();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setDisponibilidad(auxBoolean);
                    break;
                case 9:
                    auxInt = ValidarAtributos.ValidarNota();
                    Colecciones.ListadoEstudiantilGeneral.get(indice).setNota(auxInt);
                    break;        
            }
        
        }
       
        
    }
}
