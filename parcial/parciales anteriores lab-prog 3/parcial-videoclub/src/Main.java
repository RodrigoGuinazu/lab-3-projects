import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int buscar = -1;
        Tienda startUp = new Tienda();
        Cliente cliente = new Cliente("Esteban", "Quito", "38756123", "116784391");
        startUp.cargarTienda();
        System.out.println("Listado de peliculas/juegos\n");
        startUp.mostrarListado();
        System.out.println("\nStock Total: \n" + Alquilable.getStockTotal());
        System.out.println("\nTotal Alquilados: \n" + Alquilable.getAlquilados());
        char control = 's';
        while (control == 's'){
            System.out.println("\nIngrese el id de la pelicula/juego que desea alquilar: ");
            buscar = scan.nextInt();
            startUp.agregarALista(buscar, cliente);
            System.out.println("Si desea agregar mas peliculas oprima s, si desea ir al checkout oprima cualquier otra tecla");
            scan.nextLine();
            control = scan.nextLine().charAt(0);
        }
        System.out.println("Peliculas alquiladas! Que tenga buen dia\n");
        startUp.mostrarListado();
        System.out.println("\nTotal Alquilados: \n" + Alquilable.getAlquilados());
        System.out.println("Devolviendo todas las pelis/juegos...\n");
        cliente.devolverTodo();
        startUp.mostrarListado();
        System.out.println("\nTotal Alquilados: \n" + Alquilable.getAlquilados());
        System.out.println("\nLa pelicula mas larga es: " + startUp.getlongestMovie() + "\n");
        System.out.println("\nEl juego mas largo es: " + startUp.getlongestGame() + "\n");


    }
}
