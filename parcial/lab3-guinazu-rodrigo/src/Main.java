import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Local> locales = new ArrayList<Local>();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        Plato plato1 = new Plato("PIZZA", 1000);
        Plato plato2 = new Plato("FIDEOS", 600);
        Plato plato3 = new Plato("HAMBURGESA", 900);
        Plato plato4 = new Plato("EMPANADA", 170);
        ArrayList<Plato> platosPizeria = new ArrayList<Plato>();
        platosPizeria.add(plato1);
        platosPizeria.add(plato4);
        ArrayList<Pago> metodoPago1 = new ArrayList<Pago>();
        metodoPago1.add(Pago.EFECTIVO);
        metodoPago1.add(Pago.DEBITO);
        Local local1 = new Local("PIZZERIA", platosPizeria, metodoPago1);
        ArrayList<Plato> platosPasta = new ArrayList<Plato>();
        platosPasta.add(plato2);
        ArrayList<Pago> metodoPago2 = new ArrayList<Pago>();
        metodoPago2.add(Pago.EFECTIVO);
        Local local3 = new Local("PASTAS", platosPasta, metodoPago2);
        ArrayList<Plato> platosHamburgeseria = new ArrayList<Plato>();
        platosHamburgeseria.add(plato3);
        ArrayList<Pago> metodoPago3 = new ArrayList<Pago>();
        metodoPago3.add(Pago.EFECTIVO);
        metodoPago3.add(Pago.DEBITO);
        metodoPago3.add(Pago.CREDITO);
        Local local4 = new Local("HAMBURGESERIA", platosHamburgeseria, metodoPago3);
        Usuario usuario = new Usuario("prueba@hotmail.com", "Pruba", "3123414123", "Pellegrini 3001");

        ArrayList<Plato> platosPedido1 = new ArrayList<Plato>();
        platosPedido1.add(plato1);
        platosPedido1.add(plato1);
        platosPedido1.add(plato4);
        Pedido pedido1 = new Pedido(local1, usuario, platosPedido1);
        pedido1.delivery();
        System.out.println(pedido1);
    }
}
