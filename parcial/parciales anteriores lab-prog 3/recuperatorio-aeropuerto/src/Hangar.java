import java.util.ArrayList;

public class Hangar {
    protected String nombre;
    protected ArrayList<Avion> aviones;

    public Hangar() {

    }

    public Hangar(String nombre) {
        this.nombre = nombre;
        this.aviones = new ArrayList<Avion>();
    }

    public void agregarAvionComercial(){
        ArrayList<String> servicios = new ArrayList<String>();
        servicios.add("WiFi");
        servicios.add("Series");
        servicios.add("Musica");
        Comercial avion = new Comercial("Airbus", "703", "Boeing", 3000, "Doble Turbina", 250, 6, servicios);
        this.aviones.add(avion);
    }

    public void agregarAvionPrivado(){
        Privado avion = new Privado("Deluxor", "420", "Airbus", 1000, "Doble Turbina", 20, true, "asdfasdfda2452351");
        this.aviones.add(avion);
    }

    public void agregarAvionCarga(){
        ArrayList<String> productos = new ArrayList<String>();
        productos.add("Celulares");
        productos.add("Notebooks");
        Carga avion = new Carga("Airbus", "999", "Boeing", 4000, "Doble Turbina", 5550, productos);
        this.aviones.add(avion);
    }

    public void agregarAvionMilitar(){
        Militar avion = new Militar("Kaza", "Stealth", "Lighting", 6000, "Doble Turbina", 10, Arma.AIRE_TIERRA, 13000);
        this.aviones.add(avion);
    }

    public ArrayList<Avion> getAviones(){
        return this.aviones;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "nombre='" + nombre + '\'' +
                ", aviones=" + aviones +
                '}';
    }
}
