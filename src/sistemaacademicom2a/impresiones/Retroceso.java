package sistemaacademicom2a.impresiones;

import java.util.Scanner;
import sistemaacademicom2a.colecciones.Consultar;
import sistemaacademicom2a.colecciones.Crear;
import static sistemaacademicom2a.colecciones.Crear.*;
import sistemaacademicom2a.colecciones.Eliminar;
import sistemaacademicom2a.colecciones.Modificar;
import sistemaacademicom2a.colecciones.Mostrar;
import sistemaacademicom2a.principal.SistemaAcademicoM2A;
import sistemaacademicom2a.validaciones.ValidarAtributos;
import sistemaacademicom2a.validaciones.ValidarRangoNumericos;

/**
 *
 * @author Zhunio Miguel
 * 
 */
public class Retroceso {
    private static String[] args = new String[2];
    public static String auxCodigo;

    
    
    public static void Opciones(String op, String ops) {
        Scanner in = new Scanner(System.in);
        String opRetroceso;
        boolean error = true;
        
        do {
            System.out.println("\nDigite: \n"
                        + "1 ---> Volver al menu principal \n"
                        + "2 ---> Desa repetir la actividad\n"
                        + "3 --->  Salir");
                opRetroceso = in.next();
                ValidarRangoNumericos.Rango1a3(opRetroceso);
        } while (!error);
        
        if (ops.equalsIgnoreCase("1")) {
            if (opRetroceso.equals("1")) { SistemaAcademicoM2A.main(args); }
        
            if (opRetroceso.equals("2")) { Crear.CrearInstancias(op, ops); }
        
            if (opRetroceso.equals("3")) { System.exit(0); }
        }
        
        if (ops.equalsIgnoreCase("2")) {
            if (opRetroceso.equals("1")) { SistemaAcademicoM2A.main(args); }
        
            if (opRetroceso.equals("2")) { Mostrar.GenerarReporte(op, ops); }
        
            if (opRetroceso.equals("3")) { System.exit(0); }
        }
        
        if (ops.equalsIgnoreCase("3")) {
            if (opRetroceso.equals("1")) { SistemaAcademicoM2A.main(args); }
        
            if (opRetroceso.equals("2")) { 
                if (!(op.equalsIgnoreCase("3"))) {    
                    auxCodigo = ValidarAtributos.ValidarCedula();
                    Consultar.ConsultarExistencia(auxCodigo, op, ops);
                } else {
                    auxCodigo = ValidarAtributos.ValidarCodigoAula();
                    Consultar.ConsultarExistencia(auxCodigo, op, ops);
                }
            }
        
            if (opRetroceso.equals("3")) { System.exit(0); }
        }
        
        if (ops.equalsIgnoreCase("4")) {
            if (opRetroceso.equals("1")) { SistemaAcademicoM2A.main(args); }
        
            if (opRetroceso.equals("2")) { Modificar.ModificarInstancia(op); }
        
            if (opRetroceso.equals("3")) { System.exit(0); }
        }
        
        if (ops.equalsIgnoreCase("5")) {
            if (opRetroceso.equals("1")) { SistemaAcademicoM2A.main(args); }
        
            if (opRetroceso.equals("2")) { Eliminar.EliminarObjeto(op, ops); }
        
            if (opRetroceso.equals("3")) { System.exit(0); }
        }
        
    }
    
}
