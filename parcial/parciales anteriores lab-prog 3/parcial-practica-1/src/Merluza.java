public class Merluza {
    static float precio = 11;

    static float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Merluza{" +
                "precio=" + precio +
                '}';
    }
}
