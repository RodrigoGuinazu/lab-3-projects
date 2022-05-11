import java.util.ArrayList;

public class Tienda {
    private ArrayList<Alquilable> listado;

    public Tienda() {
        this.listado = new ArrayList<Alquilable>();
    }

    public void cargarTienda(){
        Pelicula pelicula1 = new Pelicula("Prisioners", "Policial", 140, "Denis Villeneuve");
        pelicula1.agregarCopia();
        Pelicula pelicula2 = new Pelicula("Titanic", "Romantica", 180, "James Cameron");
        pelicula2.agregarCopia();
        pelicula2.agregarCopia();
        Pelicula pelicula3 = new Pelicula("Toy Story", "Animada", 90, "Pixar");
        pelicula3.agregarCopia();
        pelicula3.agregarCopia();
        pelicula3.agregarCopia();
        Pelicula pelicula4 = new Pelicula("Matrix", "Accion", 170, "Warner Bros");
        pelicula4.agregarCopia();
        Juego juego1 = new Juego("Doom", 10, "Accion", "id Software");
        juego1.agregarCopia();
        Juego juego2 = new Juego("Uncharted 4", 14, "Aventura", "Naughty Dog");
        juego2.agregarCopia();
        juego2.agregarCopia();
        Juego juego3 = new Juego("Fifa 22", 8, "Deporte", "EA Sports");
        juego3.agregarCopia();
        juego3.agregarCopia();
        juego3.agregarCopia();
        juego3.agregarCopia();
        Juego juego4 = new Juego("Grand Theft Auto V", 40, "Mundo abierto", "Rockstar Games");
        juego4.agregarCopia();
        juego4.agregarCopia();
        juego4.agregarCopia();
        this.listado.add(pelicula1);
        this.listado.add(pelicula2);
        this.listado.add(pelicula3);
        this.listado.add(pelicula4);
        this.listado.add(juego1);
        this.listado.add(juego2);
        this.listado.add(juego3);
        this.listado.add(juego4);
    }

    public void agregarALista(int id, Cliente cliente){
        int flag = 0;
        for(Alquilable a : listado){
            if(a.buscarPorId(id)){
                flag = 1;
                a.encontrarCopia(cliente);
            }
        }
        if(flag == 0){
            System.out.println("Ese id no pertenece a ningun juego/pelicula");
        }
    }

    public Pelicula getlongestMovie(){
        Pelicula rta = new Pelicula();
        for(Alquilable a : listado){
            if(a instanceof Pelicula){
                if(((Pelicula) a).getDuracion() > rta.getDuracion()){
                    rta = (Pelicula) a;
                }
            }
        }
        return rta;
    }

    public Juego getlongestGame(){
        Juego rta = new Juego();
        for(Alquilable a : listado){
            if(a instanceof Juego){
                if(((Juego) a).getHorasEstimadas() > rta.getHorasEstimadas()){
                    rta = (Juego) a;
                }
            }
        }
        return rta;
    }

    public void mostrarListado(){
        for(Alquilable a : listado){
            System.out.println(a);
        }
    }
}
