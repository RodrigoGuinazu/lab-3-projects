import java.util.List;

public class Biblioteca {
    protected String nombre;
    protected List<Lectura> lecturas;

    public Biblioteca(String nombre, List<Lectura> lecturas) {
        this.nombre = nombre;
        this.lecturas = lecturas;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", lecturas=" + lecturas +
                '}';
    }
}
