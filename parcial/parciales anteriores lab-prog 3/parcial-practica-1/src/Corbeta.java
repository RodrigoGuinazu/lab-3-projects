public class Corbeta extends Barco{
    protected int capacidadJaula;

    public Corbeta(String marca, String modelo, int capaciadCombustible, int capacidadCarga, String patente) {
        super(marca, modelo, capaciadCombustible, capacidadCarga, patente);
        this.capacidadJaula = 10; // kg por jaula
    }

    @Override
    public float pescar(float jaulas){ // (puede ser media jaula)
        return (jaulas * this.capacidadJaula); // devuelve la cantidad de kg pescados
    }

    public int getCapacidadJaula() {
        return capacidadJaula;
    }

    public void setCapacidadJaula(int capacidadJaula) {
        this.capacidadJaula = capacidadJaula;
    }

    @Override
    public String toString() {
        return "Corbeta{" +
                "capacidadJaula=" + capacidadJaula +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capaciadCombustible=" + capaciadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente='" + patente + '\'' +
                '}';
    }
}
