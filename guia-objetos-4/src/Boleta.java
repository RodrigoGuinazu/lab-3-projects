import java.time.LocalDate;
import java.util.ArrayList;

public class Boleta {
    protected static int nextId = 1;
    protected int id;
    protected Cliente cliente;
    protected ArrayList<Alquiler> alquileres;
    protected LocalDate fecha;

    public Boleta(Cliente cliente, ArrayList<Alquiler> alquileres) {
        this.id = nextId;
        nextId++;
        this.cliente = cliente;
        this.alquileres = alquileres;
        this.fecha = LocalDate.now();
    }

    public StringBuilder getFechasDevolucion(){
        StringBuilder fechas = new StringBuilder();

        for(Alquiler a : this.alquileres){
            fechas.append("Pelicula: ");
            fechas.append(a.getPelicula().titulo); // llamo al metodo get pelicula de la clase Alquiler, y despues llamo al metodo getTitulo de la clase Pelicula
            fechas.append(" Fecha de devolucion: ");
            fechas.append(a.getFechaDevolucion()); // ver como lo transformo a DD/MM/AAAA
            fechas.append("\n");
        }

        return fechas;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", fecha de hoy=" + fecha+ '\'' +
                ", " + getFechasDevolucion() +
                '}';
    }
}
