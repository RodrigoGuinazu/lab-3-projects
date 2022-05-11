public abstract class Instrumento {
    protected float precio;
    protected String marca;

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public Instrumento(float precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
