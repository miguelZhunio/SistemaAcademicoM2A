package sistemaacademicom2a.colecciones;
import sistemaacademicom2a.impresiones.Retroceso;

/**
 *
 * @author Zhunio Miguel
 */
public class Consultar {
    private static boolean error = false;
    private static String auxCodigo;
    public static int indice;
    
    public static Object ConsultarExistencia(String auxCodigo, String op, String ops) {
        
        Object objecto = new Object();
        
        if (op.equals("1")) {
                           
            for (int i = 0; i < Colecciones.ListadoDeProfesores.size(); i++) {
                
                if ((Colecciones.ListadoDeProfesores.get(i).getCedula()).equalsIgnoreCase(auxCodigo)) {
                    System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n", 
                            "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "ASISTENCIA","FALTAS", "MATERIA"
                    );
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
                    objecto = Colecciones.ListadoDeProfesores.get(i);
                    error = true;
                }
           
            }
            
        }
        
        if (op.equalsIgnoreCase("2")) {
            
            for (int i = 0; i < Colecciones.ListadoEstudiantilGeneral.size(); i++) {
                if ((Colecciones.ListadoEstudiantilGeneral.get(i).getCedula()).equalsIgnoreCase(auxCodigo)) {
                    System.out.printf("%5s|%14s|%14s|%14s|%14s|%14s|%14s|%14s|%18s|%n",
                        "NUM","CODIGO", "NOMBRE", "APELLIDO", "EDAD", "SEXO", "ASISTENCIA", "FALTAS", "NOTA"
                    );
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
                    objecto = Colecciones.ListadoEstudiantilGeneral.get(i);
                    error = true;                    
                }
                
            }
            
        }
        
        if (op.equalsIgnoreCase("3")) {
            for (int i = 0; i < Colecciones.ListadoDeAulas.size(); i++) {
                if ((Colecciones.ListadoDeAulas.get(i).getCodigo()).equalsIgnoreCase(auxCodigo)) {
                    System.out.printf("%5s|%20s|%20s|%20s|%22s|%n", 
                    "NUM","CODIGO AULA", "NOMBRE PROFESOR", "MATERIA DADA", "NUMERO DE ESTUDIANTES"
                    );
                    System.out.printf("%5d|%20s|%20s|%20s|%22d|%n", 
                        (i+1),
                        Colecciones.ListadoDeAulas.get(i).getCodigo(),
                        Colecciones.ListadoDeAulas.get(i).getMiProfesor().getNombre(),
                        Colecciones.ListadoDeAulas.get(i).getMateriaDada(),
                        Colecciones.ListadoDeAulas.get(i).getListadoEstudiantil().size()
                    );
                    objecto = Colecciones.ListadoDeAulas.get(i);
                    error = true;
                }
            }
        }
        
        if (!error) {
            System.out.println("NO EXISTE NO EXISTE NO EXISTE");
        }
        
        return objecto;
        
    }
    
    public static int ConsultarIndice(String codigo, String op) {
        
        
        if (op.equalsIgnoreCase("1")) {
            for (int i = 0; i < Colecciones.ListadoDeProfesores.size(); i++) {
                if ((Colecciones.ListadoDeProfesores.get(i).getCedula()).equalsIgnoreCase(codigo)) {
                    indice = i;
                    break;
                }
            }
        }
        if (op.equalsIgnoreCase("2")) {
            for (int i = 0; i < Colecciones.ListadoEstudiantilGeneral.size(); i++) {
                if ((Colecciones.ListadoEstudiantilGeneral.get(i).getCedula()).equalsIgnoreCase(codigo)) {
                    indice = i;
                    break;
                }
            }
        }
        
        if (op.equalsIgnoreCase("3")) {
            for (int i = 0; i < Colecciones.ListadoDeAulas.size(); i++) {
                 if ((Colecciones.ListadoDeAulas.get(i).getCodigo()).equalsIgnoreCase(codigo)) {
                     indice = i;
                     break;
                 }
            }
        }
        return indice;
    }
    
    public static boolean ConsultarSiExiste(String codigo, String op) {
        
        
        if (op.equalsIgnoreCase("1")) {
            for (int i = 0; i < Colecciones.ListadoDeProfesores.size(); i++) {
                if ((Colecciones.ListadoEstudiantilGeneral.get(i).getCedula()).equalsIgnoreCase(codigo)) {
                    error = true;
                    break;
                }
            }
        }
        if (op.equalsIgnoreCase("2")) {
            for (int i = 0; i < Colecciones.ListadoEstudiantilGeneral.size(); i++) {
                if ((Colecciones.ListadoEstudiantilGeneral.get(i).getCedula()).equalsIgnoreCase(codigo)) {
                   error = true;
                }
            }
        }
        
        if (op.equalsIgnoreCase("3")) {
            for (int i = 0; i < Colecciones.ListadoDeAulas.size(); i++) {
                 if ((Colecciones.ListadoDeAulas.get(i).getCodigo()).equalsIgnoreCase(codigo)) {
                    error = true;
                 }
            }
        }
        
        if (!error) {
            System.out.println("OBJETO NO ENCONTRADO");
        }
        return error;
    }
    
    public static boolean BuscarAsignatura(String nombre) {
        for (int i = 0; i < Colecciones.ListadoMaterias.length; i++) {
            if (Colecciones.ListadoMaterias[i].equalsIgnoreCase(nombre)) {
                System.out.println("\nRegistrado....\n");
                error = true;   
                break;
            }
            
        }
        if(!error) { System.out.println("MATERIA NO ENCONTRADA");}
        return error;
    }
  
}
