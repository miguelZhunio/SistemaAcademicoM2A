package sistemaacademicom2a.principal;

import java.util.Scanner;
import sistemaacademicom2a.impresiones.*;

/**
 *
 * @author Zhunio Miguel
 */
public class SistemaAcademicoM2A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op;
        boolean error = false;
        
        do {
            Menu.MostrarMenu();
            op = in.next();      
        } while (error);
        
        SubMenu.MostrarSubMenu(op);
        op = in.next();
        
        
        
    }
    
}
