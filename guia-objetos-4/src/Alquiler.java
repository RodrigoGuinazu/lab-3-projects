import java.time.LocalDate;

public class Alquiler {
    protected static int nextId = 1;
    protected int id;
    protected Cliente cliente;
    protected Copia pelicula;
    protected long cantDias; // lo hago long porque lo necesito para LocalDate.now().plusDays()
    protected LocalDate fecha;
    protected LocalDate fechaDevolucion;
    protected boolean estado; // true = vigente / false = no vigente

    public Alquiler(Cliente cliente, Copia pelicula, int cantDias) {
        this.id = nextId;
        nextId++;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.cantDias = cantDias;
        this.fecha = LocalDate.now();
        this.fechaDevolucion = LocalDate.now().plusDays(cantDias);
        this.estado = true;
    }

    public void setDevuelto(){
        this.estado = false;
    }

    public Boolean getEstado(){
        return this.estado;
    }

    public Copia getPelicula(){
        return this.pelicula;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public LocalDate getFechaDevolucion(){
        return this.fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", pelicula=" + pelicula +
                ", cantDias=" + cantDias +
                ", fecha=" + fecha +
                ", fechaDevolucion=" + fechaDevolucion +
                ", estado (true = alquilado / false = NO alquilada)=" + estado +
                '}';
    }
}
