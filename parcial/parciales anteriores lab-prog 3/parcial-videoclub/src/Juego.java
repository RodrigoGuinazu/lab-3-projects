public class Juego extends Alquilable{
    protected String titulo;
    protected int horasEstimadas;
    protected String genero;
    protected String compania;

    public Juego() {
        this.horasEstimadas = 10;
    }

    public Juego(String titulo, int horasEstimadas, String genero, String compania) {
        super();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "titulo='" + titulo + '\'' +
                ", id=" + id +
                ", horasEstimadas=" + horasEstimadas +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ", copias=" + copias +
                ", registroClientes=" + registroClientes +
                '}';
    }
}
