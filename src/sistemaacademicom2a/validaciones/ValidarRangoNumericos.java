package sistemaacademicom2a.validaciones;

/**
 *
 * @author Zhunio Miguel
 */
public class ValidarRangoNumericos {
    public static boolean error = true;
    public static String message = "\nERROR DIGITE UNA OPCION VALIDA\n";
    
    public static boolean Rango1a4(String cod) {
        error = cod.matches("[1-4]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    
    public static boolean Rango1a6(String cod) {
        error = cod.matches("[1-6]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    
    public static boolean Rango1a3(String cod) {
        error = cod.matches("[1-3]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    
    public static boolean Rango1a2(String cod) {
        error = cod.matches("[1-2]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    
    public static boolean Rango1a9(String cod) {
        error = cod.matches("[1-9]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    public static boolean Rango1aN(String cod) {
        error = cod.matches("[1-9]+"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    public static boolean Rango1a7(String cod) {
        error = cod.matches("[1-7]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    public static boolean Rango1a8(String cod) {
        error = cod.matches("[1-8]{1}"); 
        if (!error) { System.out.println(message);}
        return error;
    }
    
}
