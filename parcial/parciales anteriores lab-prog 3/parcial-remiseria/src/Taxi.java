public class Taxi extends Vehiculo{
    protected double contadorKm;
    protected double bajadaBandera;
    protected double precioKm;

    public Taxi(String marca, String modelo, String combustible, String patente, double contadorKm, double bajadaBandera, double precioKm) {
        super(marca, modelo, combustible, patente);
        this.contadorKm = contadorKm;
        this.bajadaBandera = bajadaBandera;
        this.precioKm = precioKm;
    }

    public void setContadorKm(double kms){
        this.contadorKm += kms;
    }

    @Override
    public double precioViaje(double kmRecorridos) {
        return ((kmRecorridos*this.precioKm) + this.bajadaBandera);
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "contadorKm=" + contadorKm +
                ", bajadaBandera=" + bajadaBandera +
                ", precioKm=" + precioKm +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustible='" + combustible + '\'' +
                ", patente='" + patente + '\'' +
                ", libre=" + libre +
                '}';
    }
}
