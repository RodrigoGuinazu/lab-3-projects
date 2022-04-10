import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
// importo esto para poder comparar la fecha de devolucion estimada con la fecha de devolucion real

public class Devolucion {
    protected static int nextId = 1;
    protected int id;
    protected LocalDate fecha;
    protected Alquiler alquiler;
    protected Copia pelicula;
    protected long penalidad; // lo hago long porque necesito guardar lo que devuelve DAYS.between()

    public Devolucion(Alquiler alquiler) {
        this.id = nextId;
        nextId++;
        this.fecha = LocalDate.now();
        this.alquiler = alquiler;
        alquiler.setDevuelto();
        this.pelicula = alquiler.getPelicula();
        pelicula.setDevuelto();
        this.penalidad = DAYS.between(alquiler.getFechaDevolucion(), fecha);
    }

    @Override
    public String toString() {
        return "Devolucion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", pelicula=" + pelicula.titulo +
                ", penalidad=" + penalidad + // ver como devolver solamente si la penalidad es mayor a 0
                '}';
    }
}
