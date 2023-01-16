package sistemaacademicom2a.impresiones;

import java.util.Scanner;
import sistemaacademicom2a.validaciones.*;

/**
 *
 * @author Zhunio Miguel
 */
public class Menu {
        private static Scanner in = new Scanner(System.in);
        private static String op = "";  
        private static boolean error = true;
    
    public static String MostrarMenu() {         
           
        do {
            System.out.print("Menu Principal \n"
                + "1. Docente \n"
                + "2. Alumno \n"
                + "3. Aula \n"
                + "4. Salir \n"
                + "----> ");
            
            op = in.next();
            
            error = ValidarRangoNumericos.Rango1a4(op);
                    
        } while (!error);
        
        if (op.equals("4")) { System.exit(0); } // Sale del programa
                       
        return op;
        
    }
    
}
