package sistemaacademicom2a.principal;

import java.util.Scanner;
import sistemaacademicom2a.colecciones.*;
import sistemaacademicom2a.impresiones.*;
import sistemaacademicom2a.validaciones.*;
import sistemaacademicom2a.clases.*;

/**
 *
 * @author Zhunio Miguel
 */
public class SistemaAcademicoM2A {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();
        
        String op, ops = "", auxCodigo;
        
        op = Menu.MostrarMenu();
        ops = SubMenu.MostrarSubMenu(op);

        
       
        
        switch(ops) {
            case "1":
                Crear.CrearInstancias(op, ops);
                break;
            case "2":
                Mostrar.GenerarReporte(op, ops);
                Retroceso.Opciones(op, ops);
                break;
            case "3":
                if (!(op.equalsIgnoreCase("3"))) {    
                    auxCodigo = ValidarAtributos.ValidarCedula();
                    Consultar.ConsultarExistencia(auxCodigo, op, ops);
                    Retroceso.Opciones(op, ops);
                } else {
                    auxCodigo = ValidarAtributos.ValidarCodigoAula();
                    Consultar.ConsultarExistencia(auxCodigo, op, ops);
                    Retroceso.Opciones(op, ops);
                } 
                break;
            case "4":
                Modificar.ModificarInstancia(op);
                break;
            case "5":
                Eliminar.EliminarObjeto(op, ops);
                break;
            case "6":
                if (op.equalsIgnoreCase("1")) {
                    profesor = ValidarAtributos.ValidarProfesor();
                    profesor.Disponibilidad();
                } if (op.equalsIgnoreCase("2")) {
                    alumno = ValidarAtributos.ValidarEstudiante();
                    alumno.Disponibilidad();
                }
                            
        }
        
        
        
        
        
    }
    
}
