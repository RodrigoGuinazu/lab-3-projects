import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public abstract class Alquilable {
    protected static int nextId;
    protected int id;
    protected static int stockTotal = 0;
    protected static int alquilados = 0;
    protected ArrayList<Copia> copias;
    protected ArrayList<StringBuilder> registroClientes;

    public Alquilable() {
        nextId++;
        this.id = nextId;
        this.copias = new ArrayList<Copia>();
        this.registroClientes = new ArrayList<StringBuilder>();
    }

    public void agregarCopia() {
        Copia nuevaCopia = new Copia();
        this.copias.add(nuevaCopia);
        stockTotal++;
    }

    public void quitarCopia(UUID id) {
        for(Copia c : this.copias){
            if(c.getId() == id){
                this.copias.remove(c);
            }
        }
    }

    public  void encontrarCopia(Cliente cliente){
        boolean flag = false;
        for(Copia c : this.copias){
            if(c.getDisponible() && !flag){
                flag = true;
                c.alquilar();
                alquilados++;
                cliente.agregarAlListado(c);
                this.registroClientes.add(this.alquiladoPor(cliente, c));
            }
        }
        if(!flag){
            System.out.println("No hay copias disponibles");
        }
    }

    public static int getStockTotal() {
        return stockTotal;
    }

    public static int getAlquilados() {
        return alquilados;
    }

    public static void restarAlquilados(){
        alquilados--;
    }

    public StringBuilder alquiladoPor(Cliente c, Copia copia){
        StringBuilder rta = new StringBuilder();
        rta.append(LocalDate.now() + ": ");
        rta.append(" " + c);
        rta.append(" Copia alquilada: " + copia.getId());
        return rta;
    }

    public boolean buscarPorId(int id) {
        if(this.id == id){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "id=" + id +
                ", copias=" + copias +
                ", registroClientes=" + registroClientes +
                '}';
    }
}
