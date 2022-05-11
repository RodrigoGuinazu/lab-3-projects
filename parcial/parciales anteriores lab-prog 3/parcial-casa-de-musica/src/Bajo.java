public class Bajo extends Electrica{
    public Bajo(float precio, String marca, String modelo) {
        super(precio, marca, 4, modelo);
    }

    @Override
    public String toString() {
        return "Bajo{" +
                "modelo='" + modelo + '\'' +
                ", cantidadCuerdas=" + cantidadCuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}