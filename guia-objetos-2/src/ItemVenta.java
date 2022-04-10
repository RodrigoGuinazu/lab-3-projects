import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private String nombre;
    private String descripcion;
    private double precio;

    public ItemVenta(String nombre, String descripcion, double precio) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
