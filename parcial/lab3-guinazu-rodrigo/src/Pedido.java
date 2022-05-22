import java.util.ArrayList;

public class Pedido implements Entrega{
    protected Local local;
    protected Usuario usuario;
    protected ArrayList<Plato> platosPedidos;
    protected double precioFinal;

    public Pedido(Local local, Usuario usuario, ArrayList<Plato> platosPedidos) {
        this.local = local;
        this.usuario = usuario;
        this.platosPedidos = platosPedidos;
        this.precioFinal = calcularPrecio();
    }

    @Override
    public double takeAway(){
        System.out.println("Retirado en el local...");
        return this.precioFinal;
    }

    @Override
    public double delivery(){
        System.out.println("Enviando al la direccion " + usuario.getDireccion());
        this.precioFinal += 150; // cobro el envio
        return this.precioFinal;
    }

    public double calcularPrecio(){
        double rta = 0;
        for(Plato p : platosPedidos){
            rta += p.getPrecio();
        }

        for(Pago p : local.getMediosDePago()){
            if(p == Pago.EFECTIVO){
                System.out.println("Efectivo: $" + rta);
            }else if(p == Pago.DEBITO){
                rta += 150;
                System.out.println("Debito: $" + (rta + 150)); // 150 de servicio
            }else if(p == Pago.CREDITO){
                rta = rta * 1.15;
                System.out.println("Credito: $" + (rta * 1.15)); // 15% de aumento
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "local=" + local +
                ", usuario=" + usuario +
                ", platosPedidos=" + platosPedidos +
                ", precioFinal=" + precioFinal +
                '}';
    }
}
