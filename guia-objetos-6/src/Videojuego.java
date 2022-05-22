public class Videojuego extends Alquilable implements Comparable<Videojuego>{
    private double horasEstimadas = 10;
    private String desarrolladora;

    public Videojuego(){
    }

    public Videojuego(String titulo, Genero genero, String desarrolladora) {
        super(titulo, genero);
        this.desarrolladora = desarrolladora;
    }

    public Videojuego(String titulo, Genero genero, double horasEstimadas, String desarrolladora) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.desarrolladora = desarrolladora;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    @Override
    public int compareTo(Videojuego o) {
        if(this.horasEstimadas > o.getHorasEstimadas()){
            return 1;
        }else if (this.horasEstimadas == o.getHorasEstimadas()) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "horasEstimadas=" + horasEstimadas +
                ", desarrolladora='" + desarrolladora + '\'' +
                ", titulo='" + titulo + '\'' +
                ", enUso=" + enUso +
                ", genero=" + genero +
                '}';
    }
}
