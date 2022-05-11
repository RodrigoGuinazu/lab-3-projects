import java.util.ArrayList;

public class Carga extends Avion{
    protected double limiteKg;
    protected ArrayList<String> productos;

    public Carga(String nombre, String modelo, String marca, double capacidadCombustible, String motor, double limiteKg, ArrayList<String> productos) {
        super(nombre, modelo, marca, capacidadCombustible, motor, 0);
        this.limiteKg = limiteKg;
        this.productos = productos;
    }

    @Override
    public boolean ingresar() {
        return true;
    }

    @Override
    public boolean descargar() {
        return true;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "limiteKg=" + limiteKg +
                ", productos=" + productos +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
