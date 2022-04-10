import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // EJ 1)
//        Cilindro cilindro = new Cilindro();
//        System.out.println(cilindro.toString());
//        System.out.println("Volumen=" + cilindro.calcularVolumen());
//        Cilindro cilindro2 = new Cilindro(5.0, 3.5);
//        System.out.println(cilindro2.toString());
//        System.out.println("Area=" + cilindro2.calcularArea());
//        System.out.println("Volumen=" + cilindro2.calcularVolumen());
//        System.out.println(cilindro2.toString());

        // EJ 2)
//        Estudiante estudiante1 = new Estudiante("40.120.574", "Jorge", "Perez", "jorge@gmail.com", "Viamonte 127", 2018, 3500.00, "Ingenieria");
//        Estudiante estudiante2 = new Estudiante("30.921.571", "Esteban", "Quito", "esteban@gmail.com", "Urquiza 1227", 2019, 5500.00, "Letras");
//        Estudiante estudiante3 = new Estudiante("43.924.624", "Maria", "Garcia", "maria@gmail.com", "Mendoza 566", 2021, 7500.00, "Cine");
//        Estudiante estudiante4 = new Estudiante("20.990.883", "Luis", "Ferrari", "luis@gmail.com", "Rawson 357", 2022, 5000.00, "Bioquimica");
//        Staff staff1 = new Staff("40.120.574", "Jose", "Alfonso", "jose@gmail.com", "Pellegrini 5603", 120000, "Noche");
//        Staff staff2 = new Staff("38.770.931", "Rodrigo", "Mendez", "rodrigo@gmail.com", "Alvear 200", 80000, "Manana");
//        Staff staff3 = new Staff("20.222.712", "Nicolas", "Fernandez", "nicolas@gmail.com", "Saavedra 975", 100000, "Noche");
//        Staff staff4 = new Staff("35.412.612", "Bautiste", "Caamano", "bautista@gmail.com", "Roca 708", 75000, "Noche");
//        ArrayList<Persona> array = new ArrayList<Persona>();
//        array.add(estudiante1);
//        array.add(estudiante2);
//        array.add(estudiante3);
//        array.add(estudiante4);
//        array.add(staff1);
//        array.add(staff2);
//        array.add(staff3);
//        array.add(staff4);
//        System.out.println(array);
//        System.out.println(estudiante1 instanceof Persona); // devuelve true si el objeto es una instancia de la clase
//        int estudiantes = 0;
//        int empleados = 0;
//        for(Persona j : array){
//            if(j instanceof Estudiante){
//                estudiantes++;
//            }else if(j instanceof Staff){
//                empleados++;
//            }
//        }
//        int totalIngreso = 0;
//        System.out.println("Hay " + empleados + " empleados, y " + estudiantes + " estudiantes");
//        for(Persona j : array){
//            if(j instanceof Estudiante){
//                totalIngreso += ((Estudiante) j).getCuotaMensual();
//            }
//        }
//        System.out.println("El ingreso total que recibe la facultad es de $" + totalIngreso);

        // EJ 3)

        /** Figura figura = new Figura(); // Esto no se puede hacer ya que la clase es abstracta y no se puede hacer una instancia de la misma */
        Circulo circulo = new Circulo(3.5, "azul");
        Rectangulo rectangulo = new Rectangulo(5.5, 10); // use el constructor que no colorea la figura
        Cuadrado cuadrado = new Cuadrado("rojo", 6);
        ArrayList<Figura> array = new ArrayList<Figura>();
        array.add(circulo);
        array.add(rectangulo);
        array.add(cuadrado);
        System.out.println(array);
        for(Figura j : array){
            System.out.println("Area: " + j.calcularArea());
            System.out.println("Perimetro: " + j.calcularPerimetro());
        }

    }
}
