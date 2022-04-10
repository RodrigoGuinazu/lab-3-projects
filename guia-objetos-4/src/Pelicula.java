public class Pelicula {
    protected String titulo;
    protected int estreno;
    protected int duracion;
    protected String genero;
    protected String clasificacion;
    protected String origen;
    protected String descripcion;

    public Pelicula(String titulo, int estreno, int duracion, String genero, String clasificacion, String origen, String descripcion) {
        this.titulo = titulo;
        this.estreno = estreno;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.origen = origen;
        this.descripcion = descripcion;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", estreno=" + estreno +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", origen='" + origen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
