public class Acustica extends Cuerda{
    protected Madera tipoMadera;

    public Acustica(float precio, String marca, Madera tipoMadera) {
        super(precio, marca, 6);
        this.tipoMadera = tipoMadera;
    }

    @Override
    public String toString() {
        return "Acustica{" +
                "tipoMadera=" + tipoMadera +
                ", cantidadCuerdas=" + cantidadCuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
