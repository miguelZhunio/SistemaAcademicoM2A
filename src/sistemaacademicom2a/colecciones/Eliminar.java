package sistemaacademicom2a.colecciones;

import sistemaacademicom2a.impresiones.*;
import sistemaacademicom2a.validaciones.*;
/**
 *
 * @author Zhunio Miguel
 */
public class Eliminar {
    private static String auxString;
    private static int auxInt;
    private static boolean auxBoolean = false;
    
    public static void EliminarObjeto(String op, String ops) {
        if (op.equalsIgnoreCase("1")) {
            auxString = ValidarAtributos.ValidarCedula();
            Consultar.ConsultarExistencia(auxString, op, ops);
            auxBoolean = Consultar.ConsultarSiExiste(auxString, op);
            
            if (auxBoolean == true) {
                auxInt = Consultar.ConsultarIndice(auxString, op);
                Colecciones.ListadoDeProfesores.remove(auxInt);
                System.out.println("ELIMINADO CORRECTAMENTE");
                
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
