public class Main {
    public static void main(String[] args) {
        Aeropuerto aeropuerto = new Aeropuerto("Ezeziza", 42069, "Lavalle 1223", 25);
        aeropuerto.cargarAeropuerto();
        aeropuerto.mostrarAeropuerto();
        aeropuerto.despegarTodos(aeropuerto.getHangar(0));
    }
}
