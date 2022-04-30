import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Roberto tiene 2 bibliotecas, ambas almacenan libros, diarios y revistas. Los cuales tienen las siguientes caracteristicas:
 codigo, titulo (o titular en caso de los diarios y revistas) y año de publicacion, que son pasadas por parametro al momento de crear los objetos.

 Los libros pueden ser de distintos generos, novelas, cuentos, etc.
 Los libros y las revistas poseen los siguientes metodos : alquilar(), devolver() y alquilado().
 Los diarios solo se pueden leer en la biblioteca y Roberto quiere saber si el diario se esta leyendo o no.

 Cosas obligatorias del ejercicio:
 Superclase para aplicar herencia
 Interfaz
 Enum

 Crear 3 libros (de distinto genero), 3 revistas y 3 diarios
 Alquilar un libro y devolverlo
 Mostrar errores si se quiere alquilar un libro alquilado
 Mostrar errores si se quiere devolver una revista devuelta
 Mostrar errores si se esta leyendo un diario
 Mostrar un listado de libros, revistas y diarios disponibles y no disponibles.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Lectura> listado = new ArrayList<Lectura>();
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca 1", listado);

        Libro libro1 = new Libro(123, 1999, true, "Harry Potter", Genero.CUENTO);
        Libro libro2 = new Libro(412, 1886, true, "Dr. Jekyll y Mr. Hyde", Genero.NOVELA);
        Libro libro3 = new Libro(514, 1892, true, "Sherlock Holmes", Genero.POLICIAL);
        Revista revista1 = new Revista(134, 2007, true, "Art Attack");
        Revista revista2 = new Revista(555, 2012, true, "Gente");
        Revista revista3 = new Revista(321, 2022, true, "Ole");
        Diario diario1 = new Diario(451, 2022, true, "Clarin");
        Diario diario2 = new Diario(150, 2022, true, "La Nacion");
        Diario diario3 = new Diario(199, 2022, true, "La Capital");

        listado.add(libro1);
        listado.add(libro2);
        listado.add(libro3);
        listado.add(revista1);
        listado.add(revista2);
        listado.add(revista3);
        listado.add(diario1);
        listado.add(diario2);
        listado.add(diario3);

        int opcion;

        do{
            System.out.println("[1] Mostrar todos los libros/diarios/revistas");
            System.out.println("[2] Alquilar un libro/diario/revista");
            System.out.println("[3] Devolver un libro/diario/revista");
            System.out.println("[4] Mostrar todos los libros/diarios/revistas que no se encuentren en uso");

            System.out.println("Ingrese una opcion o 0 para salir: ");
            opcion = scan.nextInt();

            switch(opcion){
                case 1 : {
                    for(Lectura l : listado){
                        System.out.println(l.toString());
                    }
                }break;

                case 2 : {
                    System.out.println("Sacando una Lectura\n");
                    Lectura aux = Lectura.buscarLectura(listado);
                    if(aux instanceof Diario){
                        Diario d = (Diario) aux;
                        d.sacarParaLeer();
                    }else if(aux instanceof Revista){
                        Revista r = (Revista) aux;
                        r.alquilar();
                    }else{
                        Libro l = (Libro) aux;
                        l.alquilar();
                    }
                }break;

                case 3 : {
                    System.out.println("Devolviendo una Lectura\n");
                    Lectura aux = Lectura.buscarLectura(listado);
                    if(aux instanceof Diario){
                        Diario d = (Diario) aux;
                        d.devolver();
                    }else if(aux instanceof Revista){
                        Revista r = (Revista) aux;
                        r.devolver();
                    }else{
                        Libro l = (Libro) aux;
                        l.devolver();
                    }
                }break;

                case 4 : {
                    for(Lectura l : listado){
                        if(l.getDisponibilidad()){
                            System.out.println(l.toString());
                        }
                    }
                }break;
            }

        }while(opcion != 0);

    }
}
