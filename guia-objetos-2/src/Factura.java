import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Factura {
    private UUID id;
    private double total = 0;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<ItemVenta> items;

    public Factura(double total, Cliente cliente, ArrayList<ItemVenta> items) {
        this.id = UUID.randomUUID();
        for(ItemVenta j : items){
            this.total += j.getPrecio();
        }
        this.fecha = Calendar.getInstance().getTime();
        this.cliente = cliente;
        this.items = items;
    }

    public double subtotal(){
        return this.total;
    }

    public double totalAPagar(){
        return (this.total - (this.total*this.cliente.getDescuento()/100));
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", total=" + total +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                '}';
    }
}
