public class Cuadrado extends Rectangulo{

    // sin color
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    // con color
    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

}
