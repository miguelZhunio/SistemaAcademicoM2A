package sistemaacademicom2a.validaciones;

import java.util.Scanner;
import sistemaacademicom2a.colecciones.Consultar;
import sistemaacademicom2a.clases.*;
import sistemaacademicom2a.colecciones.Colecciones;
import sistemaacademicom2a.colecciones.Mostrar;



/**
 *
 * @author Zhunio Miguel
 */
public class ValidarAtributos {
    private static boolean error = true;
    private static String messageError = "\nERROR, ENTRADA NO VALIDA\n";
    private static Scanner in = new Scanner(System.in);
    private static String auxString;
    private static char auxChar;
    private static int auxInt;
    private static boolean auxBoolean;
    
    
    public static String ValidarCedula() {
        do {
            System.out.print("Ingrese el numero de cedula ---> ");
            auxString = in.next();
            error = auxString.matches("[0-9]{10}");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
                
        return auxString;
    }    
    
    public static String ValidarNombre() {
        do {
            System.out.print("Ingrese el nombre ---> ");
            auxString = in.next();
            error = auxString.matches("[A-Z]{1}[a-z]+");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
                
        return auxString;
    } 
    public static String ValidarApellido() {
        do {
            System.out.print("Ingrese el apellido ---> ");
            auxString = in.next();
            error = auxString.matches("[A-Z]{1}[a-z]+");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
                
        return auxString;
    }    
    
    public static int ValidarEdadProfesor() {
        do {
            do {
                System.out.print("Ingrese su edad ---> ");
                auxString = in.next();
                error = auxString.matches("[1-9]{1,2}");
            
                if (!error) { System.out.println(messageError);}
            
            } while(!error);
            
            auxInt = Integer.valueOf(auxString);
            
            if (!(auxInt >=25 && auxInt <= 60)) { 
                error = false;
                System.out.println("ERROR EDAD NO VALIDA");
            }
            
        } while (!error);
        
                
        return auxInt;
    } 
    
    public static int ValidarEdadAlumno() {
        do {
            do {
                System.out.print("Ingrese su edad ---> ");
                auxString = in.next();
                error = auxString.matches("[1-9]{1,2}");
            
                if (!error) { System.out.println(messageError);}
            
            } while(!error);
            
            auxInt = Integer.valueOf(auxString);
            
            if (!(auxInt >=17 && auxInt <= 45)) { 
                error = false;
                System.out.println("ERROR EDAD NO VALIDA");
            }
            
        } while (!error);
        
                
        return auxInt;
    } 
    
    public static char ValidarSexo() {
        do {
            System.out.print("Ingrese su genero \n"
                    + "M - Hombre \n"
                    + "F - Femenino \n"
                    + " ---> ");
            auxString = in.next();
            error = auxString.matches("M|F");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
        
        auxChar = auxString.charAt(0);
                
        return auxChar;
    }   
    
    public static String ValidarAsignatura() {
        
        do {
            Mostrar.MostrarAsignatura();
            
            do {
                System.out.print("Ingrese la asignatura que va ha impartir ---> ");
                auxString = in.next();
                error = auxString.matches("[A-Z]{1}[a-z]+");

                if (!error) { System.out.println(messageError);}
            
            } while(!error);
        
            error = Consultar.BuscarAsignatura(auxString);
            
        } while (!error);
                
        return auxString;
    }  
    
    public static String ValidarCodigoAula() {
        do {
            System.out.print("Ingrese el codigo ---> ");
            auxString = in.next();
            error = auxString.matches("[0-9]{1,10}");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
                
        return auxString;
    }    
    
    public static Profesor ValidarProfesor() {
        Object profesorRegistrado;
        do {
            Mostrar.GenerarReporte("1", "2");
            do {
                System.out.print("Ingrese el numero del profesor (Primera columna) ---> ");
                auxString = in.next();
                error = auxString.matches("[1-9]{1,10}"); 
                
                if (!error) { System.out.println(messageError);} 

                int num = Integer.valueOf(auxString);
                error = num >= Colecciones.ListadoDeProfesores.size();
                if (!error) { System.out.println("FUERA DE LOS RANGOS");
                } else {
                    auxString = Colecciones.ListadoDeProfesores.get(num-1).getCedula();
                } 
                
            } while(!error);      
                
        } while(!error);
            
        
        auxInt = Consultar.ConsultarIndice(auxString, "1");
        profesorRegistrado = Colecciones.ListadoDeProfesores.get(auxInt);
        return (Profesor) profesorRegistrado;
                     
    }   
    
    public static Alumno ValidarEstudiante() {
        Object alumnoRegistrado;
        do {
            Mostrar.GenerarReporte("2", "2");
            do {
                System.out.print("Ingrese el numero del estudiante (Primera columna) ---> ");
                auxString = in.next();
                error = auxString.matches("[1-9]{1,10}");    
                if (!error) { System.out.println(messageError);} 

                int num = Integer.valueOf(auxString);
                if (num >= Colecciones.ListadoEstudiantilGeneral.size()) { System.out.println("FUERA DE LOS RANGOS");
                } else {
                    auxString = Colecciones.ListadoEstudiantilGeneral.get(num-1).getCedula();
                } 
                
            } while(!error);
            
                
        } while(!error);
            
        auxInt = Consultar.ConsultarIndice(auxString, "2");
        alumnoRegistrado = Colecciones.ListadoEstudiantilGeneral.get(auxInt);
                           
        return (Alumno) alumnoRegistrado;
    } 
    
    public static boolean ValidarAsistencia() {
        do {
            System.out.print("Ingrese la asistencia y/o Disponibilidad  ---> ");
            auxString = in.next();
            error = auxString.matches("true|false|True|False");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
        
        auxBoolean = Boolean.valueOf(auxString);
                
        return auxBoolean;
    }  
    
    public static int ValidarNota() {
        do {
            System.out.print("Ingrese la nota ---> ");
            auxString = in.next();
            error = auxString.matches("[0-10]");
            
            if (!error) { System.out.println(messageError);}
            
        } while(!error);
        
        auxInt = Integer.valueOf(auxString);
                
        return auxInt;
    }    
    
     

}
