import java.util.ArrayList;

public class Comercial extends Avion{
    protected int azafatas;
    protected ArrayList<String> servicios;

    public Comercial(String nombre, String modelo, String marca, double capacidadCombustible, String motor, int asientos, int azafatas, ArrayList<String> servicios) {
        super(nombre, modelo, marca, capacidadCombustible, motor, asientos);
        this.azafatas = azafatas;
        this.servicios = servicios;
    }

    @Override
    public boolean servirComida() {
        return true;
    }

    @Override
    public boolean ofrecerMantas() {
        return true;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "azafatas=" + azafatas +
                ", servicios=" + servicios +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
