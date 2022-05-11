public abstract class Electrica extends Cuerda implements Amplificar{
    protected String modelo;

    public Electrica(float precio, String marca, int cantidadCuerdas, String modelo) {
        super(precio, marca, cantidadCuerdas);
        this.modelo = modelo;
    }

    @Override
    public String sonidoAmplificado(){
        return (this.getClass() + ": SONIDO AMPLIFICADO");
    }

    @Override
    public String toString() {
        return "Electrica{" +
                "modelo='" + modelo + '\'' +
                ", cantidadCuerdas=" + cantidadCuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
