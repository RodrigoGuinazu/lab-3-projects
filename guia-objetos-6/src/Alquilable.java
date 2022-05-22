import java.util.Objects;

public abstract class Alquilable {
    protected String titulo;
    protected boolean enUso;
    protected Genero genero;

    private static int alquilados = 0;

    public Alquilable() {
    }

    public Alquilable(String titulo, Genero genero) {
        this.titulo = titulo;
        this.enUso = false;
        this.genero = genero;
    }

    public void alquilar(){
        this.enUso = true;
        alquilados++;
    }

    public void devolver(){
        this.enUso = false;
        alquilados--;
    }

    public boolean isEnUso(){
        return this.enUso;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public static int getAlquilados() {
        return alquilados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        Alquilable that = (Alquilable) o;
        return this.titulo.equalsIgnoreCase(that.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
