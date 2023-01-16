package sistemaacademicom2a.principal;

import java.util.Scanner;
import sistemaacademicom2a.colecciones.Consultar;
import sistemaacademicom2a.colecciones.Crear;
import sistemaacademicom2a.colecciones.Mostrar;
import sistemaacademicom2a.impresiones.*;
import sistemaacademicom2a.validaciones.*;

/**
 *
 * @author Zhunio Miguel
 */
public class SistemaAcademicoM2A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String op, ops, auxCodigo;
        
        op = Menu.MostrarMenu();
        ops =SubMenu.MostrarSubMenu(op);
        
        switch(ops) {
            case "1":
                Crear.CrearInstancias(op);
                break;
            case "2":
                Mostrar.GenerarReporte(op);
                break;
            case "3":
                if (!(op.equalsIgnoreCase("3"))) {    
                    auxCodigo = ValidarAtributos.ValidarCedula();
                    Consultar.ConsultarExistencia(auxCodigo, op);
                } else {
                    auxCodigo = ValidarAtributos.ValidarCodigoAula();
                    Consultar.ConsultarExistencia(auxCodigo, op);
                }
                break;
            case "4":
                
            case "5":
                
        }
        
        
        
    }
    
}
