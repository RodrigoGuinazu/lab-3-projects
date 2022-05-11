public class Main {
    public static void main(String[] args) {
        Tienda startUp = new Tienda();

        startUp.cargarArreglo();
        System.out.println(startUp.mostrarInstrumentos());
        System.out.println(startUp.amplificar());
        System.out.println(startUp.aumentarPrecios());
        System.out.println(startUp.mostrarInstrumentos());
    }
}
