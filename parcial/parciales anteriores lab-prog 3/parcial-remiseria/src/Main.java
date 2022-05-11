import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agencia startUp = new Agencia();

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("Roberto", "Rodriguez", "22351531", "Vieytes 332");
        Cliente cliente2 = new Cliente("Clara", "Garcia", "01169499012", "Lamadrid 1900");
        Cliente cliente3 = new Cliente("Pablo", "Viale", "223445123", "Rawson 3313");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        startUp.cargarAgenica();
        System.out.println("\nInicio\n");
        System.out.println(startUp.mostrarVehiculos());

        cliente2.pedirAuto(3.5, startUp.conseguirVehiculoLibre());
        cliente1.pedirAuto(12, startUp.conseguirVehiculoLibre());
        cliente2.terminarViaje();
        cliente3.pedirAuto(9, startUp.conseguirVehiculoLibre());
        System.out.println(startUp.mostrarVehiculos());

        startUp.cancelarTodosLosViajes();
        System.out.println("\nTodos los viajes cancelados\n");
        System.out.println(startUp.mostrarVehiculos());

        System.out.println("\nTotal recaudado: $" + Agencia.getTotalRecaudado());

    }
}
