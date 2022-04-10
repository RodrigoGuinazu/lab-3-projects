public class Rectangulo extends Figura{

    private double altura;
    private double base;

    // sin color
    public Rectangulo(double altura, double base) {
        super();
        this.altura = altura;
        this.base = base;
    }

    // con color
    public Rectangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return (this.base * this.altura);
    }

    public double calcularPerimetro(){
        return ((2 * this.base) + (2 * this.altura));
    }

    public double getAltura(){
        return this.altura;
    }

    public double getBase(){
        return this.base;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", color=" + super.getColor() +
                '}';
    }
}
