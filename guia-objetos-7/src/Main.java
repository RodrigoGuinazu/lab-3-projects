import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumeroIncorrectoException {
        //  EJERCICIO 1
        /**
            El problema en ese codigo es que siempre entrara en el primer catcc(Exception e).
            Ya que RuntimeException hereda de la clase Exception, entonces todos los errores que sean
            RuntimeException tambien seran errores Exception
         */

        //  EJERCICIO 2
        /**
         Si o si va retornar 3 ya que el finally se cumple si entra o no al catch
         */

        //  EJERCICIO 3
        /**
        Random rand = new Random();
        int nro = rand.nextInt(500);
        System.out.println(nro);
        int flag = 0;
        while(flag == 0){
            try {
                Juego.numeroAlAzar(nro);
                flag = 1;
            }catch (InputMismatchException e){
                System.out.println(e);
            }catch (NumeroIncorrectoException e){
                System.out.println(e);
            }
        }
         */

        //  EJERCICIO 4
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        Colegio colegio = new Colegio(alumnos);

        int i = 0;
        System.out.println("Cargando alumnos...");
        while(i < 5){
            try{
                colegio.agregarAlumno();
                i++;
            }catch(CampoVacioException e){
                System.out.println(e);
            }
        }
        int flag = 0;
        String quitar;
        Alumno aux;
        Scanner scan = new Scanner(System.in);
        while (flag == 0){
            try{
                System.out.println("Ingrese el nombre del alumno que desea quitar");
                quitar = scan.nextLine();
                aux = colegio.buscar(quitar);
                colegio.borrar(aux);
                flag = 1;
            }catch(AlumnoNoExisteException e){
                System.out.println(e);
            }
        }
        System.out.println(colegio.getAlumnos());
    }
}
