public class Militar extends Avion{
    protected Arma tipo;
    protected int balas;

    public Militar(String nombre, String modelo, String marca, double capacidadCombustible, String motor, int asientos, Arma tipo, int balas) {
        super(nombre, modelo, marca, capacidadCombustible, motor, asientos);
        this.tipo = tipo;
        this.balas = balas;
    }

    @Override
    public boolean ingresar() {
        return true;
    }


    @Override
    public String toString() {
        return "Militar{" +
                "tipo=" + tipo +
                ", balas=" + balas +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
