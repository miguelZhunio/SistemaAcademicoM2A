package sistemaacademicom2a.impresiones;

import java.util.Scanner;
import sistemaacademicom2a.validaciones.*;

/**
 *
 * @author Zhunio Miguel
 */
public class SubMenu {
    private static Scanner in = new Scanner(System.in);
    private static boolean error = true;
    private static String ops;
    
    
    public static String MostrarSubMenu(String op) {
        if (op.equalsIgnoreCase("3")) {
           do {
                 System.out.print("Submenu \n"
                    + op + ".1. Crear \n"
                    + op + ".2. Mostrar \n"
                    + op + ".3. Consultar \n"
                    + op + ".4. Modificar \n"
                    + op + ".5. Eliminar \n"
                    + op + ".6. Regresar \n"
                    + "----> ");
                    ops = in.next();
            
                error = ValidarRangoNumericos.Rango1a6(ops);
            
            }while (!error);
        
            if (ops.equals("6")) { Menu.MostrarMenu(); } 
        
            
        } else {
            do {
                System.out.print("Submenu \n"
                    + op + ".1. Crear \n"
                    + op + ".2. Mostrar \n"
                    + op + ".3. Consultar \n"
                    + op + ".4. Modificar \n"
                    + op + ".5. Eliminar \n"
                    + op + ".6. Ver disponiblidad \n"
                    + op + ".7. Regresar \n"
                    + "----> ");
                ops = in.next();

                error = ValidarRangoNumericos.Rango1a7(ops);

            } while (!error);
        
            if (ops.equals("7")) { 
                Menu.MostrarMenu(); 
            }
        }
        
        return ops;
        
        
        
    }
    
 
    
    
}
