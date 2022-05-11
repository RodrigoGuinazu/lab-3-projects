import java.util.ArrayList;

public class Aeropuerto {
    protected String nombre;
    protected int codigoInternacional;
    protected String direccion;
    protected static int capacidadDeOperacion; // (cantidad de aviones que pueden transitar por sus pistas)
    protected ArrayList<Hangar> hangares;

    protected static int cantidadAviones = 0;

    public Aeropuerto(String nombre, int codigoInternacional, String direccion, int capacidadDeOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadDeOperacion = capacidadDeOperacion;
        this.hangares = new ArrayList<Hangar>();
    }

    public void cargarAeropuerto(){
        Hangar hangar18 = new Hangar("Hangar 18");
        hangar18.agregarAvionMilitar();
        hangar18.agregarAvionMilitar();
        hangar18.agregarAvionMilitar();
        hangar18.agregarAvionMilitar();
        hangar18.agregarAvionCarga();
        hangar18.agregarAvionCarga();
        hangares.add(hangar18);
        Hangar hangar13 = new Hangar("Hangar 13");
        hangar13.agregarAvionComercial();
        hangar13.agregarAvionComercial();
        hangar13.agregarAvionComercial();
        hangar13.agregarAvionComercial();
        hangar13.agregarAvionPrivado();
        hangares.add(hangar13);
    }

    public void mostrarAeropuerto(){
        for(Hangar h : this.hangares){
            System.out.println(h.getNombre());
            for(Avion a : h.getAviones()){
                System.out.println(a);
            }
        }
    }

    public Hangar getHangar(int i){
        Hangar rta = new Hangar();
        if(i < hangares.size()){
            rta = hangares.get(i);
        }else{
            System.out.println("El inidice que pasaste no contiene ningun hangar");
        }
        return rta;
    }

    public void despegarTodos(Hangar hangar){
        if(hangar.getNombre() != null){
            ArrayList<Avion> aviones = hangar.getAviones();
            for(Avion a : aviones){
                a.despegar();
            }
        }
    }

    public static void setCantidadAviones(int aviones){
        if((cantidadAviones += aviones) > capacidadDeOperacion){
            cantidadAviones += aviones;
        }else{
            System.out.println("Sobrepasaste la capacidad de operaciones del aeropuerto");
        }
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigoInternacional=" + codigoInternacional +
                ", direccion='" + direccion + '\'' +
                ", capacidadDeOperacion=" + capacidadDeOperacion +
                ", hangares=" + hangares +
                '}';
    }
}
