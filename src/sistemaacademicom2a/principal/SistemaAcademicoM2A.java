package sistemaacademicom2a.principal;

import java.util.Scanner;
import sistemaacademicom2a.colecciones.Consultar;
import sistemaacademicom2a.colecciones.Crear;
import sistemaacademicom2a.colecciones.Eliminar;
import sistemaacademicom2a.colecciones.Modificar;
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
                Crear.CrearInstancias(op, ops);
                
                break;
            case "2":
                Mostrar.GenerarReporte(op, ops);
                
                break;
            case "3":
                if (!(op.equalsIgnoreCase("3"))) {    
                    auxCodigo = ValidarAtributos.ValidarCedula();
                    Consultar.ConsultarExistencia(auxCodigo, op, ops);
                } else {
                    auxCodigo = ValidarAtributos.ValidarCodigoAula();
                    Consultar.ConsultarExistencia(auxCodigo, op, ops);
                }
                
                break;
            case "4":
                Modificar.ModificarInstancia(op);
                Retroceso.Opciones(op, ops);
                break;
            case "5":
                Eliminar.EliminarObjeto(op, ops);
                Retroceso.Opciones(op, ops);
                break;
                
        }
        
        System.out.println("GRACIAS POR LA VISITA");
        
        
        
    }
    
}
