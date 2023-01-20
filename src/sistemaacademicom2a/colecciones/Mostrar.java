package sistemaacademicom2a.colecciones;

import sistemaacademicom2a.impresiones.Retroceso;

/**
 *
 * @author Zhunio Miguel
 */
public class Mostrar {
    
    public static void GenerarReporte(String op, String ops) {
        
        if (op.equalsIgnoreCase("1")) {
            System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n", 
                "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "DISPONIBLIDAD","FALTAS", "MATERIA"
            );
            for (int i = 0; i < Colecciones.ListadoDeProfesores.size(); i++) {
                
                System.out.printf("%5d|%14s|%14s|%14s|%14d|%14c|%14b|%14d|%18s|%n",
                        (i+1),
                        Colecciones.ListadoDeProfesores.get(i).getCedula(),
                        Colecciones.ListadoDeProfesores.get(i).getNombre(),
                        Colecciones.ListadoDeProfesores.get(i).getApellido(),
                        Colecciones.ListadoDeProfesores.get(i).getEdad(),
                        Colecciones.ListadoDeProfesores.get(i).getSexo(),
                        Colecciones.ListadoDeProfesores.get(i).isDisponibilidad(),
                        Colecciones.ListadoDeProfesores.get(i).getNumeroFaltas(),
                        Colecciones.ListadoDeProfesores.get(i).getMateria() 
                );
            }
        }
        
        if (op.equalsIgnoreCase("2")) {
            System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n",
                    "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "DISPONIBILIDAD", "FALTAS", "NOTA"
            );
            for (int i = 0; i < Colecciones.ListadoEstudiantilGeneral.size(); i++) {
                
                System.out.printf("%5d|%14s|%14s|%14s|%14d|%14c|%14b|%14d|%18d|%n", 
                        (i+1),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getCedula(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getNombre(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getApellido(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getEdad(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getSexo(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).isDisponibilidad(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getNumeroFaltas(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getNota() 
                );
            }
        }
        
        if (op.equalsIgnoreCase("3")) {
            System.out.println("-----------------------------------------------------------------------------------------------");
            for (int i = 0; i < Colecciones.ListadoDeAulas.size(); i++) {
                System.out.println("CODIGO AULA ---> " + Colecciones.ListadoDeAulas.get(i).getCodigo());
                System.out.println("ASIGNATURA IMPARTIDA ---> " + Colecciones.ListadoDeAulas.get(i).getMateriaDada());
                System.out.println("NUMERO MAXIMO DE ESTUDIANTES ---> " + Colecciones.ListadoDeAulas.get(i).getMAX_ESTUDIANTES());
                // Generar reporte de docente
                System.out.println("\nPROFESOR");
                Consultar.ConsultarExistencia(Colecciones.ListadoDeAulas.get(i).getMiProfesor().getCedula(), "1", "3");
                // Reporte de estudiante del aula.
                System.out.println("\nLISTADO ESTUDIANTIL");
                Colecciones.ListadoDeAulas.get(i).GenerarReporteEstudianteAula();  
                System.out.println("-----------------------------------------------------------------------------------------------");

            }
   
        }
          
        
    } 
    
    public static void MostrarAsignatura() {
        System.out.println("\n");
        for (int i = 0; i < Colecciones.ListadoMaterias.length; i++) {
            System.out.println(Colecciones.ListadoMaterias[i]);
        }
        System.out.println("\n");
    }
    
   
    
}
