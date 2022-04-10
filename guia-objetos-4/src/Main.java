import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // arreglos a nivel app
        ArrayList<Copia> peliculas = new ArrayList<Copia>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
        ArrayList<Devolucion> devoluciones = new ArrayList<Devolucion>();
        ArrayList<Boleta> boletas = new ArrayList<Boleta>();
        ArrayList<Copia> resultado;
        ArrayList<Copia> peliculasAAlquilar = null;
        Cliente rtaCliente = null;
        ArrayList<Alquiler> alquileresUsuario = new ArrayList<Alquiler>();
        Alquiler nuevoAlquiler;
        Boleta boleta;
        ArrayList<Copia> ordenadoPorPopularidad = new ArrayList<Copia>();
        ArrayList<Copia> ordenadoPorGenero = new ArrayList<Copia>();
        int opcion;
        int opcionGenero;

        // agrego pelis al sistema
        Copia peli1 = new Copia("Titanic", 1997, 194, "Drama", "PG-13", "US", "Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.");
        Copia peli2 = new Copia("Titanic", 1997, 194, "Drama", "PG-13", "US", "Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.");
        Copia peli3 = new Copia("Titanic", 1997, 194, "Drama", "PG-13", "US", "Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.");
        Copia peli4 = new Copia("Toy Story", 1995, 120, "Comedia", "G", "US", "Woody (Tom Hanks), a good-hearted cowboy doll who belongs to a young boy named Andy (John Morris), sees his position as Andy's favorite toy jeopardized when his parents buy him a Buzz Lightyear (Tim Allen) action figure.");
        Copia peli5 = new Copia("Toy Story", 1995, 120, "Comedia", "G", "US", "Woody (Tom Hanks), a good-hearted cowboy doll who belongs to a young boy named Andy (John Morris), sees his position as Andy's favorite toy jeopardized when his parents buy him a Buzz Lightyear (Tim Allen) action figure.");
        Copia peli6 = new Copia("Matrix", 1999, 136, "Accion", "R", "US", "Thomas Anderson, a computer programmer, is led to fight an underground war against powerful computers who have constructed his entire reality with a system called the Matrix.");
        Copia peli7 = new Copia("Die Hard", 1983, 120, "Accion", "R", "US", "Hoping to spend Christmas with his estranged wife, detective John McClane arrives in LA. However, he learns about a hostage situation in an office building and his wife is one of the hostages.");
        Copia peli8 = new Copia("Interstellar", 2014, 170, "Aventura", "PG-13", "US", "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft, along with a team of researchers, to find a new planet for humans.");
        Copia peli9 = new Copia("The Shining", 1982, 140, "Horror", "R", "US", "Jack and his family move into an isolated hotel with a violent past. Living in isolation, Jack begins to lose his sanity, which affects his family members.");
        Copia peli10 = new Copia("Planet Earth", 2009, 90, "Documental", "G", "US", "Dazzling, state-of-the-art high-definition imagery highlights this breathtaking documentary series featuring footage of some of the world's most awe-inspiring natural wonders -- from the oceans to the deserts to the polar ice caps. Actress Sigourney Weaver narrates this American version of the original BBC production.");
        Copia peli11 = new Copia("The Conjuring", 2013, 110, "Horror", "R", "US", "The Perron family moves into a farmhouse where they experience paranormal phenomena. They consult demonologists, Ed and Lorraine Warren, to help them get rid of the evil entity haunting them.");
        Copia peli12 = new Copia("Super Size Me", 2004, 90, "Documental", "PG", "US", "Director Morgan Spurlock's social experiment in fast-food gastronomy sees him attempting to subsist uniquely on food from the McDonald's menu for an entire month. In the process his weight balloons, his energy level plummets and he experiences all sorts of unexpected -- and terrifying -- side effects. He also examines the corporate giant's growing role in the lives of American consumers and explores its methods of indoctrinating young people and its contribution to America's obesity epidemic.");
        Copia peli13 = new Copia("Uncharted", 2022, 100, "Aventura", "PG-13", "US", "Treasure hunter Victor Sullivan recruits street-smart Nathan Drake to help him recover a 500-year-old lost fortune amassed by explorer Ferdinand Magellan. What starts out as a heist soon becomes a globe-trotting, white-knuckle race to reach the prize before the ruthless Santiago Moncada can get his hands on it. If Sully and Nate can decipher the clues and solve one of the world's oldest mysteries, they stand to find $5 billion in treasure -- but only if they can learn to work together.");
        Copia peli14 = new Copia("Superbad", 2007, 90, "Comedia", "R", "US", "Two high school boys want to enjoy their lives to the fullest before they go to different colleges. Unfortunately, their debauchery lands them in trouble.");
        Copia peli15 = new Copia("Requiem for a dream", 2001, 150, "Drama", "R", "US", "Sara, a widow who lives a retired life, develops an obsession to lose weight and starts taking pills. However, she gets addicted to the medication and it takes a toll on her mental health.");
        peliculas.add(peli1);
        peliculas.add(peli2);
        peliculas.add(peli3);
        peliculas.add(peli4);
        peliculas.add(peli5);
        peliculas.add(peli6);
        peliculas.add(peli7);
        peliculas.add(peli8);
        peliculas.add(peli9);
        peliculas.add(peli10);
        peliculas.add(peli11);
        peliculas.add(peli12);
        peliculas.add(peli13);
        peliculas.add(peli14);
        peliculas.add(peli15);

        // agrego usuarios al sistema
        Cliente cliente1 = new Cliente("45324125","Rodrigo", "0134102421", "Saavedra 129");
        Cliente cliente2 = new Cliente("39706523","Julian", "011923384", "Catamarca 1479");
        Cliente cliente3 = new Cliente("35866021","Esteban", "223412512", "Viamonte 557");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        do {
            System.out.println("[1] Buscar Peliculas");
            System.out.println("[2] Agregar Peliculas para alquilar");
            System.out.println("[3] Buscar Cliente");
            System.out.println("[4] Crear Cliente");
            System.out.println("[5] Generar Boleta");
            System.out.println("[6] Devolver Pelicula");
            System.out.println("[7] Ver alquileres vigentes");
            System.out.println("[8] Alquileres que se deben al dia de la fecha");
            System.out.println("[9] Ultimas peliculas alquiladas por el cliente");
            System.out.println("[10] Ordenar las peliculas por popularidad");
            System.out.println("[11] Ordenar las peliculas por popularidad y genero");
            System.out.println("[12] Ver detalle de todas las peliculas");

            System.out.println("Ingrese una opcion o 0 para salir: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1 : {
                    // verifica si la pelicula existe, si existe, hay copia?
                    resultado = new ArrayList<Copia>();
                    System.out.println("Buscar pelicula: ");
                    scan.nextLine(); // como el fflush();
                    String busqueda = scan.nextLine();
                    resultado = Copia.buscarPelicula(peliculas, busqueda);
                    System.out.println("Resultado de la busqueda: ");
                    System.out.println(resultado.toString());
                }break;

                case 2 : {
                    // se agregan las peliculas que el usuario se va llevar
                    if(peliculasAAlquilar == null){
                        peliculasAAlquilar = Copia.alquilarPeliculas(peliculas);
                    }else{
                        System.out.println("Ya alquilaste las peliculas, debes ir a generar la boleta para agregar mas peliculas");
                    }
                }break;

                case 3 : {
                    // verifica si el cliente ya esta en la base de datos
                    System.out.println("Ingrese el dni del cliente: ");
                    scan.nextLine(); // como el fflush();
                    String dniABuscar = scan.nextLine();
                    rtaCliente = Cliente.buscarCliente(dniABuscar, clientes);
                    if(rtaCliente == null){  // si no existe crea un nuevo cliente
                        System.out.println("El cliente que busca no existe");
                    }
                }break;

                case 4 : {
                    // crear un nuevo cliente
                    System.out.println("Agregar un nuevo cliente");
                    System.out.println("DNI: ");
                    scan.nextLine(); // como el fflush();
                    String nuevoDni = scan.nextLine();
                    System.out.println("Nombre: ");
                    String nuevoNombre = scan.nextLine();
                    System.out.println("Telefono: ");
                    String nuevoTelefono = scan.nextLine();
                    System.out.println("Direccion: ");
                    String nuevaDireccion = scan.nextLine();
                    rtaCliente = new Cliente(nuevoDni, nuevoNombre, nuevoTelefono, nuevaDireccion);
                    clientes.add(rtaCliente);
                }break;

                case 5 : {
                    // generar boleta
                    if(peliculasAAlquilar == null || rtaCliente == null){
                        System.out.println("Debes ir al case 2 para agregar las peliculas y al case 3 o 4 (buscar o crear cliente)");
                    }else{
                        int dias;
                        for(Copia a : peliculasAAlquilar){
                            System.out.println("Ingrese la cantidad de dias que va alquilar " + a.getTitulo() + ":");
                            dias = scan.nextInt();
                            nuevoAlquiler = new Alquiler(rtaCliente, a, dias);
                            rtaCliente.setAlquileres(nuevoAlquiler);
                            rtaCliente.setAlquileresVigentes(nuevoAlquiler);
                            alquileresUsuario.add(nuevoAlquiler); // guardo los alquileres para poder generar la boleta
                            alquileres.add(nuevoAlquiler);
                        }
                        boleta = new Boleta(rtaCliente, alquileresUsuario);
                        boletas.add(boleta);
                        peliculasAAlquilar = null;
                    }
                }break;

                case 6 : {
                    // cliente devuelve las peliculas
                    for(Alquiler a : rtaCliente.getAlquileresVigentes()){
                        Devolucion devolucion = new Devolucion(a);
                        devoluciones.add(devolucion);
                    }
                    rtaCliente.resetAlquileresVigentes();
                }break;

                case 7 : {
                    // consultar alquileres vigentes
                    for(Alquiler a : alquileres){
                        if(a.getEstado() == true){
                            System.out.println(a);
                        }
                    }
                }break;

                case 8 : {
                    // consultar alquileres que se deben en la fecha de hoy
                    for(Alquiler a : alquileres){
                        if((DAYS.between(a.getFechaDevolucion(), LocalDate.now())) == 0 && a.getEstado() == true){
                            System.out.println(a);
                        }
                    }
                }break;

                case 9 : {
                    // arreglo de las ultimas peliculas alquiladas por el cliente (muestra los alquileres del cliente que se busco en el case 3 o 4)
                    if(rtaCliente == null){
                        System.out.println("Debes ir al case 3 o 4 (buscar o crear cliente)");
                    }else{
                        System.out.println(rtaCliente.getAlquileres());
                    }
                }break;

                case 10 : {
                    // consultar los titulos mas alquilados
                    int flag;
                    Copia nuevaCopia;
                    for(Copia c : peliculas){
                        flag = 0;
                        for(Copia r : ordenadoPorPopularidad){
                            if(c.getTitulo().equals(r.getTitulo())){
                                flag = 1;
                                r.aumentarVecesAlquilado(c.getVecesAlquilado());
                            }
                        }
                        if(flag == 0){
                            nuevaCopia = c;
                            ordenadoPorPopularidad.add(nuevaCopia);
                        }
                    }

                    // llamo al objecto collections y a su metodo sort
                    Collections.sort(ordenadoPorPopularidad, new Comparator<Copia>() { // como 2do parametro creo una funcion comparativa
                        public int compare(Copia o1, Copia o2) {
                            return Integer.valueOf(o2.getVecesAlquilado()).compareTo(o1.getVecesAlquilado()); // si quiero ordenar de forma ascendiente cambio el orden de 01 y 02
                        }
                    });
                    System.out.println(ordenadoPorPopularidad);
                }break;

                case 11 : {
                    // buscar titulo por genero y ordenarlos por popularidad
                    do {
                        System.out.println("[1] Accion");
                        System.out.println("[2] Aventura");
                        System.out.println("[3] Comedia");
                        System.out.println("[4] Drama");
                        System.out.println("[5] Horror");
                        System.out.println("[6] Documental");

                        System.out.println("Ingrese una opcion o 0 para salir: ");
                        opcionGenero = scan.nextInt();

                        switch (opcionGenero) {
                            case 1 : {
                                System.out.println("Accion\n");
                                ordenadoPorGenero = Copia.ordenarPorGenero(ordenadoPorPopularidad, "Accion");
                                System.out.println(ordenadoPorGenero);
                            }break;

                            case 2 : {
                                System.out.println("Aventura\n");
                                ordenadoPorGenero = Copia.ordenarPorGenero(ordenadoPorPopularidad, "Aventura");
                                System.out.println(ordenadoPorGenero);
                            }break;

                            case 3 : {
                                System.out.println("Comedia\n");
                                ordenadoPorGenero = Copia.ordenarPorGenero(ordenadoPorPopularidad, "Comedia");
                                System.out.println(ordenadoPorGenero);
                            }break;

                            case 4 : {
                                System.out.println("Drama\n");
                                ordenadoPorGenero = Copia.ordenarPorGenero(ordenadoPorPopularidad, "Drama");
                                System.out.println(ordenadoPorGenero);
                            }break;

                            case 5 : {
                                System.out.println("Horror\n");
                                ordenadoPorGenero = Copia.ordenarPorGenero(ordenadoPorPopularidad, "Horror");
                                System.out.println(ordenadoPorGenero);
                            }break;

                            case 6 : {
                                System.out.println("Documental\n");
                                ordenadoPorGenero = Copia.ordenarPorGenero(ordenadoPorPopularidad, "Documental");
                                System.out.println(ordenadoPorGenero);
                            }break;
                        }

                    }while (opcionGenero != 0);
                }break;

                case 12 : {
                    // ver informacion detallada de cada titulo
                    for (Copia p : peliculas){
                        System.out.println(p.getInfo());
                    }
                }break;
            }
        }while (opcion != 0);
    }
}
