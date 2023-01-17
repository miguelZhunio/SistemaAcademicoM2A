package sistemaacademicom2a.colecciones;
import java.util.Scanner;
import sistemaacademicom2a.validaciones.*;
/**
 *
 * @author Zhunio Miguel
 */
public class Eliminar {
    private static String auxString, auxOp;
    private static int auxInt;
    private static boolean auxBoolean = false, error;
    private static Scanner in = new Scanner(System.in);
    
    public static void EliminarObjeto(String op, String ops) {
        
        if (op.equalsIgnoreCase("1")) {
            auxString = ValidarAtributos.ValidarCedula();
            Consultar.ConsultarExistencia(auxString, op, ops);

            auxBoolean = Consultar.ConsultarSiExiste(auxString, op);
            if (auxBoolean == true) {
                do {
                    System.out.println("Seguro desea eliminarlo \n1. SI \n2. NO");
                    auxOp = in.next();
                    error = ValidarRangoNumericos.Rango1a2(auxOp);
                } while(!error);
                 
                if (auxOp.equalsIgnoreCase("1")) {
                    auxInt = Consultar.ConsultarIndice(auxString, op)-1;
                    Colecciones.ListadoDeProfesores.remove(auxInt);
                    System.out.println("ELIMINADO CORRECTAMENTE");
                }
                
                
            }
                       
        }
        
        if (op.equalsIgnoreCase("2")) {
            
            auxString = ValidarAtributos.ValidarCedula();
            Consultar.ConsultarExistencia(auxString, op, ops);
            auxBoolean = Consultar.ConsultarSiExiste(auxString, op);
            
            if (auxBoolean) {
                auxInt = Consultar.ConsultarIndice(auxString, op);
                Colecciones.ListadoEstudiantilGeneral.remove(auxInt);
                System.out.println("ELIMINADO CORRECTAMENTE");
                
            }
                       
        }
        
    }
    
}
