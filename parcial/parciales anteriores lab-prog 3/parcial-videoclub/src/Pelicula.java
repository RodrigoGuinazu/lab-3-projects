public class Pelicula extends Alquilable{
    protected String titulo;
    protected String genero;
    protected int duracion;
    protected String creador;

    public Pelicula() {
        this.duracion = 60;
    }

    public Pelicula(String titulo, String genero, int duracion, String creador) {
        super();
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", id=" + id +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", creador='" + creador + '\'' +
                ", copias=" + copias +
                ", registroClientes=" + registroClientes +
                '}';
    }
}
