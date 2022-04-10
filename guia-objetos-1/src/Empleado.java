/**
 2. Modele el objeto Empleado que posee las siguientes características, dni, nombre, apellido y salario. El mismo debe contar con la posibilidad de calcular el salario anual.
 A su vez se requiere otro método que permita aumentar el salario dependiendo del porcentaje que se le pase por parámetro.
 Considere crear un método que facilite imprimir por pantalla las características del objeto de la siguiente forma:
 Empleado[dni=?, nombre=?, apellido=?, salario=?]
 a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
 b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
 c. Imprima ambos objetos por pantalla
 d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
 */

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    Empleado(int dni, String nombre, String apellido, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public void setAumento(){
        this.salario = this.salario * 1.15;
    }

    public double salarioAnual(){
        return salario*12;
    }

    public String getInfo(){
        return ("Dni: " + this.dni + " Nombre: "+ this.nombre + " Apellido: " + this.apellido + " Salario (Mensual): " + this.salario + " Salario (Anual): " + this.salarioAnual());
    }
}
