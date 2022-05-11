public class Main {
    public static void main(String[] args) {
        Lancha lanchita = new Lancha("Yamaha", "Kawasaki", 300, 5000, "ABC123");
        Corbeta corbetita = new Corbeta("Argentina", "Argentum 2000", 400, 20000, "CXZ987");

        System.out.println("Lancha: $" + lanchita.calcularValor(lanchita.pescar(10)));
        System.out.println("Corbeta: $" + corbetita.calcularValor(corbetita.pescar(40)));
    }
}
