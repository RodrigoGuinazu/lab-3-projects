public class Remis extends Vehiculo{
    protected double precioCuadra;

    public Remis(String marca, String modelo, String combustible, String patente, double precioCuadra) {
        super(marca, modelo, combustible, patente);
        this.precioCuadra = precioCuadra;
    }

    @Override
    public double precioViaje(double kmRecorridos) {
        return ((kmRecorridos*10.0)*this.precioCuadra);
    }

    @Override
    public String toString() {
        return "Remis{" +
                "precioCuadra=" + precioCuadra +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustible='" + combustible + '\'' +
                ", patente='" + patente + '\'' +
                ", libre=" + libre +
                '}';
    }
}
