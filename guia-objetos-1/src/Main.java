import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // 1)
//        Rectangulo nuevoRectangulo = new Rectangulo();
//        System.out.println("Alto: " + nuevoRectangulo.getAlto() + " Ancho: " + nuevoRectangulo.getAncho());
//        nuevoRectangulo.setAlto(5);
//        nuevoRectangulo.setAncho(10);
//        System.out.println("Alto: " + nuevoRectangulo.getAlto() + " Ancho: " + nuevoRectangulo.getAncho());
//        System.out.println("El area es: " + nuevoRectangulo.calcularArea());
//        System.out.println("El perimetro es: " + nuevoRectangulo.calcularPerimetro());

        // 2)
//        Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
//        Empleado empleado2 = new Empleado(34234123, "Ana", "Sánchez", 27500);
//        empleado1.setAumento();
//        System.out.println(empleado1.getInfo());
//        System.out.println(empleado2.getInfo());
        
        // 3)
//        ItemDeVenta item = new ItemDeVenta("Parlante bluetooth con luces", 3, 29999.99);
//        System.out.println(item.getInfo());

//        // 4)
//        Cuenta homeBanking = new Cuenta("Rodrigo Garcia", 15000);
//        homeBanking.credito(2500);
//        homeBanking.debito(1500);
//        homeBanking.debito(30000); // muestra el error al principio
//        System.out.println(homeBanking.getInfo());

        // 5)
        int hora, minuto, segundo;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Ingrese la hora: ");
            hora = scan.nextInt();
        }while(hora < 0 || hora > 23);

        do{
            System.out.println("Ingrese los minuto: ");
            minuto = scan.nextInt();
        }while(minuto < 0 || minuto > 59);

        do{
            System.out.println("Ingrese los segundo: ");
            segundo = scan.nextInt();
        }while(segundo < 0 || segundo > 59);

        Hora horaActual = new Hora(hora, minuto, segundo);
        System.out.println(horaActual.getHora());
        horaActual.restarSegundo();
        System.out.println(horaActual.getHora());
    }
}