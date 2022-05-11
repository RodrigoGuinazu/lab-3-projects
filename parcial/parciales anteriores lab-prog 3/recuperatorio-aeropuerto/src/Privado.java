public class Privado extends Avion{
    protected boolean jacuzzi;
    protected String claveWifi;

    public Privado(String nombre, String modelo, String marca, double capacidadCombustible, String motor, int asientos, boolean jacuzzi, String claveWifi) {
        super(nombre, modelo, marca, capacidadCombustible, motor, asientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
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
    public boolean verMundial() {
        return true;
    }

    @Override
    public String toString() {
        return "Privado{" +
                "jacuzzi=" + jacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
