/**
 1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor 1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También debe contar con un método para calcular el área y perímetro del mismo. Ejecute las siguientes pruebas:
 a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
 b. Imprimir por pantalla el alto y ancho.
 c. Imprimir por pantalla el área y perímetro.
 d. Modificar el alto y el ancho de la instancia.
 e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
 f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
 */

public class Rectangulo {
    private double ancho;
    private double alto;

    Rectangulo(){
        ancho = 1;
        alto = 1;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public double calcularArea(){
        return this.ancho * this.alto;
    }

    public double calcularPerimetro(){
        return this.alto * 2 + this.ancho * 2;
    }
}
