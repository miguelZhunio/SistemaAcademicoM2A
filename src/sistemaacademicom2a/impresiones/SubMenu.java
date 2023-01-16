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
    
    public static String MostrarSubMenu(String op) {
        do {
            System.out.print("Submenu \n"
                + op + ".1. Crear \n"
                + op + ".2. Mostrar \n"
                + op + ".3. Consultar \n"
                + op + ".4. Modificar \n"
                + op + ".5. Eliminar \n"
                + op + ".6. Regresar \n"
                + "----> ");
            op = in.next();
            
            error = ValidarRangoNumericos.Rango1a6(op);
            
        } while (!error);
        
        if (op.equals("6")) { Menu.MostrarMenu(); } 
        
        return op;
        
    }
    
}
