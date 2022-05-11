public class Guitarra extends Electrica{
    public Guitarra(float precio, String marca, String modelo) {
        super(precio, marca, 6, modelo);
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "modelo='" + modelo + '\'' +
                ", cantidadCuerdas=" + cantidadCuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
