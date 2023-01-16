package sistemaacademicom2a.colecciones;

/**
 *
 * @author Zhunio Miguel
 */
public class Mostrar {
    
    public static void GenerarReporte(String op) {
        
        if (op.equalsIgnoreCase("1")) {
            System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n", 
                "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "ASISTENCIA","FALTAS", "MATERIA"
            );
            for (int i = 0; i < Colecciones.ListadoDeProfesores.size(); i++) {
                
                System.out.printf("%5d|%14s|%14s|%14s|%14d|%14c|%14b|%14d|%18s|%n",
                        (i+1),
                        Colecciones.ListadoDeProfesores.get(i).getCedula(),
                        Colecciones.ListadoDeProfesores.get(i).getNombre(),
                        Colecciones.ListadoDeProfesores.get(i).getApellido(),
                        Colecciones.ListadoDeProfesores.get(i).getEdad(),
                        Colecciones.ListadoDeProfesores.get(i).getSexo(),
                        Colecciones.ListadoDeProfesores.get(i).isAsistencia(),
                        Colecciones.ListadoDeProfesores.get(i).getNumeroFaltas(),
                        Colecciones.ListadoDeProfesores.get(i).getMateria() 
                );
            }
        }
        
        if (op.equalsIgnoreCase("2")) {
            System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n",
                    "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "ASISTENCIA", "FALTAS", "NOTA"
            );
            for (int i = 0; i < Colecciones.ListadoEstudiantilGeneral.size(); i++) {
                
                System.out.printf("%5d|%14s|%14s|%14s|%14d|%14c|%14b|%14d|%18d|%n", 
                        (i+1),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getCedula(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getNombre(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getApellido(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getEdad(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getSexo(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).isAsistencia(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getNumeroFaltas(),
                        Colecciones.ListadoEstudiantilGeneral.get(i).getNota() 
                );
            }
        }
        
        if (op.equalsIgnoreCase("3")) {
            System.out.printf("%5s|%20s|%20s|%20s|%22s|%n", 
                    "NUM","CODIGO AULA", "NOMBRE PROFESOR", "MATERIA DADA", "NUMERO DE ESTUDIANTES"
            );
            for (int i = 0; i < Colecciones.ListadoDeAulas.size(); i++) {
                
                System.out.printf("%5d|%20s%20s%20s$22d%n", 
                        (i+1),
                        Colecciones.ListadoDeAulas.get(i).getCodigo(),
                        Colecciones.ListadoDeAulas.get(i).getMiProfesor().getNombre(),
                        Colecciones.ListadoDeAulas.get(i).getMateriaDada(),
                        Colecciones.ListadoDeAulas.get(i).getListadoEstudiantil().size()
                );
            }
        }
          
        
    } 
    
   
    
}
