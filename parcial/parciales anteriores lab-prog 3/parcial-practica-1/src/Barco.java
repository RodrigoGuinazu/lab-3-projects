abstract class Barco {
    protected String marca;
    protected String modelo;
    protected int capaciadCombustible;
    protected int capacidadCarga;
    protected String patente;

    public Barco(String marca, String modelo, int capaciadCombustible, int capacidadCarga, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.capaciadCombustible = capaciadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
    }

    abstract float pescar(float dato);

    public float calcularValor(float kg){
        return (kg * Merluza.getPrecio());
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capaciadCombustible=" + capaciadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente='" + patente + '\'' +
                '}';
    }
}
