public abstract class Cuerda extends Instrumento{
    protected int cantidadCuerdas;

    public Cuerda(float precio, String marca, int cantidadCuerdas) {
        super(precio, marca);
        this.cantidadCuerdas = cantidadCuerdas;
    }

    @Override
    public String toString() {
        return "Cuerda{" +
                "cantidadCuerdas=" + cantidadCuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
