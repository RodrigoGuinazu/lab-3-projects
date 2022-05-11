public abstract class Avion {
    protected String nombre;
    protected String modelo;
    protected String marca;
    protected double capacidadCombustible;
    protected String motor;
    protected int asientos;

    public Avion(String nombre, String modelo, String marca, double capacidadCombustible, String motor, int asientos) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadCombustible = capacidadCombustible;
        this.motor = motor;
        this.asientos = asientos;
    }

    public void despegar(){
        System.out.println(this.nombre + " Despegando...");
    }
    public void volar(){
        System.out.println(this.nombre + " Volando...");
    }
    public void aterrizar(){
        System.out.println(this.nombre + " Aterrizando...");
    }
    public boolean servirComida(){
        return false;
    }
    public boolean ofrecerMantas(){
        return false;
    }
    public boolean verMundial(){
        return false;
    }
    public boolean ingresar(){
        return false;
    }
    public boolean descargar(){
        return true;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", motor='" + motor + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}
