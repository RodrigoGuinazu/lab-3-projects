public class Lancha extends Barco{
    protected int capacidadRecoleccion;

    public Lancha(String marca, String modelo, int capaciadCombustible, int capacidadCarga, String patente) {
        super(marca, modelo, capaciadCombustible, capacidadCarga, patente);
        this.capacidadRecoleccion = 20; // kg por hora
    }

    @Override
    public float pescar(float horas){
        return (horas * this.capacidadRecoleccion); // devuelve la cantidad de kg pescados
    }

    public int getCapacidadRecoleccion() {
        return capacidadRecoleccion;
    }

    public void setCapacidadRecoleccion(int capacidadRecoleccion) {
        this.capacidadRecoleccion = capacidadRecoleccion;
    }

    @Override
    public String toString() {
        return "Lancha{" +
                "capacidadRecoleccion=" + capacidadRecoleccion +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capaciadCombustible=" + capaciadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente='" + patente + '\'' +
                '}';
    }
}
