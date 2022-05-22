import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**     PUNTO 1
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("Sexo: ");
        char sexo = scan.nextLine().charAt(0);
        System.out.println("Peso (kg): ");
        double peso = scan.nextDouble();
        System.out.println("Altura (m): ");
        double altura = scan.nextDouble();
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());
         */

        /**     PUNTO 2
        HashMap<Integer, Password> passwords = new HashMap<Integer, Password>();
        HashMap<Integer, Boolean> seguras = new HashMap<Integer, Boolean>();
        for(int i = 0; i<3; i++){
            System.out.println("Ingrese la longitud de la password");
            int longitud = scan.nextInt();
            Password pass = new Password(longitud);
            seguras.put(pass.hashCode(), pass.esFuerte());
            passwords.put(pass.hashCode(), pass);
        }

        for(Map.Entry<Integer, Password> p : passwords.entrySet()){ // para recorrer el hashMap hago un for each con un Map.Entry<mismos parametros que el hashmap> y con el entrySet del hashMap que querramos recorrer
            System.out.println(p.getValue() + (p.getValue().esFuerte() ? " Es fuerte" : "Es debil"));
        }
        */

        Serie serie1 = new Serie("Lost", Genero.TERROR, 10, "HBO");
        Serie serie2 = new Serie("The Walking Dead", Genero.TERROR, 11, "AMC");
        Serie serie3 = new Serie("The Office", Genero.COMEDIA, 9, "Comedy Central");
        Serie serie4 = new Serie("Los Simpsons", Genero.COMEDIA, 31, "Fox");
        Serie serie5 = new Serie("24", Genero.ACCION, "Fox");
        Serie serie6 = new Serie("24", Genero.ACCION, 5, "Fox");
        Videojuego juego1 = new Videojuego("Crash Bandicoot", Genero.AVENTURA, 6.5, "Naughty Dog");
        Videojuego juego2 = new Videojuego("Doom", Genero.ACCION, 10, "id Software");
        Videojuego juego3 = new Videojuego("Fifa 22", Genero.COMEDIA, "EA Sports");
        Videojuego juego4 = new Videojuego("The Last of Us", Genero.TERROR, 13.5, "Naughty Dog");
        Videojuego juego5 = new Videojuego("Red dead Redemption II", Genero.DRAMA, 44, "Rockstar Games");
        Videojuego juego6 = new Videojuego("Fifa 22", Genero.DRAMA, 90, "EA Sports");

        HashMap<Integer, Alquilable> alquilables = new HashMap<Integer, Alquilable>();
        alquilables.put(serie1.hashCode(), serie1);
        alquilables.put(serie2.hashCode(), serie2);
        alquilables.put(serie3.hashCode(), serie3);
        alquilables.put(serie4.hashCode(), serie4);
        alquilables.put(serie5.hashCode(), serie5);
        alquilables.put(juego1.hashCode(), juego1);
        alquilables.put(juego2.hashCode(), juego2);
        alquilables.put(juego3.hashCode(), juego3);
        alquilables.put(juego4.hashCode(), juego4);
        alquilables.put(juego5.hashCode(), juego5);

        for(Map.Entry<Integer, Alquilable> a : alquilables.entrySet()){
            if(a.getValue() instanceof Videojuego){
                Videojuego v = (Videojuego) a.getValue(); // si no pongo el getValue() no puedo acceder al objeto
                if(v.equals(juego6)){
                    System.out.println("El juego " + v.getTitulo() + " ya existe en el listado");
                }
            }
        }

        serie1.alquilar();
        serie4.alquilar();
        juego4.alquilar();
        juego5.alquilar();
        juego3.alquilar();

        for(Map.Entry<Integer, Alquilable> a : alquilables.entrySet()){
            System.out.println(a.getValue());
        }

        System.out.println("Hay " + Alquilable.getAlquilados() + " alquilados");

        serie1.devolver();
        juego3.devolver();

        for(Map.Entry<Integer, Alquilable> a : alquilables.entrySet()){
            System.out.println(a.getValue());
        }

        System.out.println("Hay " + Alquilable.getAlquilados() + " alquilados");

        Videojuego vMasLargo = new Videojuego();
        Serie sMasLargo = new Serie();
        for(Map.Entry<Integer, Alquilable> a : alquilables.entrySet()){
            if(a.getValue() instanceof Videojuego){
                if((((Videojuego) a.getValue()).compareTo(vMasLargo)) > 0){
                    vMasLargo = (Videojuego) a.getValue();
                }
            }else{
                if((((Serie) a.getValue()).compareTo(sMasLargo)) > 0){
                    sMasLargo = (Serie) a.getValue();
                }
            }
        }
        System.out.println(vMasLargo);
        System.out.println(sMasLargo);
    }
}
