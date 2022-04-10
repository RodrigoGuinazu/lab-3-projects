import java.util.UUID;

public class ClienteBanco {
    private UUID id;
    private String nombre;
    private char genero;

    public ClienteBanco(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteBanco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
