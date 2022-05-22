public class Serie extends Alquilable implements Comparable<Serie>{
    private int temporadas = 3;
    private String creador;

    public Serie(){
    }

    public Serie(String titulo, Genero genero, String creador) {
        super(titulo, genero);
        this.creador = creador;
    }

    public Serie(String titulo, Genero genero, int temporadas, String creador) {
        super(titulo, genero);
        this.temporadas = temporadas;
        this.creador = creador;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public int compareTo(Serie o) {
        if(this.temporadas > o.getTemporadas()){
            return 1;
        }else if (this.temporadas == o.getTemporadas()) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Serie{" +
                "temporadas=" + temporadas +
                ", creador='" + creador + '\'' +
                ", titulo='" + titulo + '\'' +
                ", enUso=" + enUso +
                ", genero=" + genero +
                '}';
    }
}
