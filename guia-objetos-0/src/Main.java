import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Introduccio ́n
//        // Ej 1)
//        int n = 10;
//        double a = 5.4;
//        char c = 'f';
//
//        System.out.println(n+a);
//        System.out.println(a-n);
//        System.out.println((int)c); // convierto el tipo de dato char en int para mostrarlo por consola

//        // Ej 2)
//        int x, y;
//        double n, m;
//        x = 42;
//        y = 9;
//        n = 12.4;
//        m = 9.1;
//        System.out.println((x*n)+(m - y));

//        // Ej 3)
//        int n = 12;
//        System.out.println(((n+77)-3)*2);

        // Ej 4)
//        int a, b, c, d;
//        a = 10;
//        b = 2;
//        c = 98;
//        d = 6;
//        b = c;
//        c = a;
//        a = d;
//        d = b;
//        System.out.println(a + " " + b + " " + c + " " + d);

//        // Ej 5)
//        int a = 10;
//        if(a%2 == 0){
//            System.out.println("Par");
//        }else{
//            System.out.println("Impar");
//        }

//        // Ej 6)
//        int b = 1;
//        if(b>0){
//            System.out.println("Positivo");
//        }else if(b<0){
//            System.out.println("Negativo");
//        }else{
//            System.out.println("El numero es 0 (cero)");
//        }

        // Ej 7) PENDIENTE

//        // Ej 8)
//        Scanner scan = new Scanner(System.in);
//        String name = scan.nextLine();
//        scan.close();
//        System.out.println("Buenos dias " + name);

//        // Ej 9)
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        System.out.println("Doble = " + x * 2 + " Triple = " + x * 3 );

//        // Ej 10)
//        Scanner scan = new Scanner(System.in);
//        int f = scan.nextInt();
//        System.out.println("En Celcius = " + (f-32)*0.5556);

        // Ej 11)
//        Scanner scan = new Scanner(System.in);
//        int r = scan.nextInt();
//        System.out.println("Area: " + (Math.PI * Math.pow(r, 2)) + " Perimetro: " + (2 * Math.PI * r));

//        // Ej 12)
//        Scanner scan = new Scanner(System.in);
//        int km = scan.nextInt();
//        System.out.println("En m/s: " + km * 0.2778);

//        // Ej 13)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ingrese el cateto A");
//        int catetoA = scan.nextInt();
//        System.out.println("Ingrese el cateto B");
//        int catetoB = scan.nextInt();
//        System.out.println("Hipotenusa: " + Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));

//        // Ej 14)
//        Scanner scan = new Scanner(System.in);
//        int r = scan.nextInt();
//        System.out.println("Volumen: " + 1.33333333333 * Math.PI * Math.pow(r, 3));

//        // Ej 15)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Base: ");
//        int base = scan.nextInt();
//        System.out.println("Altura: ");
//        int altura = scan.nextInt();
//        System.out.println("Area: " + (base*altura)/2);

//        // Ej 16)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Numero de 3 cifras: ");
//        int n = scan.nextInt();
//        String auxN = String.valueOf(n); // convierto el numero en string
//        char a[] = auxN.toCharArray(); // paso el string a un array de char
//        for(int i = 0; i < a.length; i++){ // recorro el array de char
//            System.out.println(a[i]);
//        }

//        // Ej 17)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Numero de 5 cifras: ");
//        int n = scan.nextInt();
//        String auxN = String.valueOf(n); // convierto el numero en string
//        char a[] = auxN.toCharArray(); // paso el string a un array de char
//        for(int i = 0; i < a.length; i++){ // recorro el array de char
//            if(a[i]%2 == 1){
//                System.out.println("Posicion " + i + " es impar");
//            }
//        }

//        // Ej 18)
//        Scanner scan = new Scanner(System.in);
//        int h, m, s;
//        System.out.println("Ingrese la hora");
//        h = scan.nextInt();
//        while(h>23){
//            System.out.println("La hora no puede ser mayor que 23, ingresa la hora de vuelta");
//            h = scan.nextInt();
//        }
//        System.out.println("Ingrese los minutos");
//        m = scan.nextInt();
//        while(m>59){
//            System.out.println("Los minutos no pueden ser mayor que 59, ingresa los minutos de vuelta");
//            m = scan.nextInt();
//        }
//        System.out.println("Ingrese los segundos");
//        s = scan.nextInt();
//        while(s>59){
//            System.out.println("Los segundos no pueden ser mayor que 59, ingresa los segundos de vuelta");
//            s = scan.nextInt();
//        }
//        System.out.println("La hora es: " + h + " : " + m + " : " + s);

        // 2. Estructuras de control, colecciones, cadenas y recursividad

        // 2.1. Colecciones: Array y ArrayList

        // Ej 1)
//        int mes;
//        Scanner scan = new Scanner(System.in);
//
//        do{
//            System.out.println("Ingrese un mes (entre 1 y 12)");
//            mes = scan.nextInt();
//        }while(mes < 1 || mes > 12);
//
//        ArrayList<Integer> meses = new ArrayList<Integer>();
//        meses.add(31);
//        meses.add(28);
//        meses.add(31);
//        meses.add(30);
//        meses.add(31);
//        meses.add(30);
//        meses.add(31);
//        meses.add(31);
//        meses.add(30);
//        meses.add(31);
//        meses.add(30);
//        meses.add(31);
//
//        System.out.println("El mes que ingresaste tiene " + meses.get(mes-1) + " dias");

//        // Ej 2)
//        int i = 0;
//        while(i < 100){
//            i++;
//            System.out.println(i);
//        }

//        // Ej 3)
//        int i = 0;
//        do{
//            i++;
//            System.out.println(i);
//        }while(i < 100);

        // Ej 4)
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        int i;
//        for(i = 1; i<101; i++){
//            //System.out.println(i);
//            a.add(i);
//        }
//
//        for(int j: a){ // for each
//            System.out.println(j);
//        }

        // Ej 5)
//        Scanner scan = new Scanner(System.in);
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        int n;
//        for(int i = 0; i < 10; i++){
//            n = scan.nextInt();
//            a.add(n);
//        }
//
//        int pos = 0;
//        int neg = 0;
//        int cero = 0;
//        for(int j: a){
//            if(j > 0){
//                pos++;
//            }else if(j < 0){
//                neg++;
//            }else{
//                cero++;
//            }
//        }
//        System.out.println("Hay " + pos + " Positivos, " + neg + " Negativos, y " + cero + " Ceros");

        // Ej 6)
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        Random rand = new Random();
//        for(int i = 0; i < 10; i++){
//            a.add(rand.nextInt(50));
//        }
//
//        for(int j: a){
//            System.out.println(j);
//        }

        // Ej 7)
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        int i = 0;
//        int n = 1;
//        while(i < 20){
//            if(n%2 == 0){
//                a.add(n);
//                i++;
//            }
//            n++;
//        }
//
//        for(int j : a){
//            System.out.println(j);
//        }

//        // Ej 8)
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        Random rand = new Random();
//        int sumaTotal = 0;
//        int n = 0;
//        for(int i = 0; i < 10; i++){
//            n = rand.nextInt((220 - 130 + 1)) + 130;
//            System.out.println(n);
//            a.add(n);
//            sumaTotal += n;
//        }
//
//        System.out.println("El promedio de altura es: " + sumaTotal/a.size() + "cm");

        // Ej 9)
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        Scanner scan = new Scanner(System.in);
//        int n = 0;
//        int sumaTotal = 0;
//        while(n != -99){
//            n = scan.nextInt();
//            a.add(n);
//            sumaTotal += n;
//        }
//        int mayores = 0;
//        for(int j : a){
//            if(j > sumaTotal/a.size()){
//                mayores++;
//            }
//        }
//
//        System.out.println("La suma total es de: " + sumaTotal + " La media es de: " + sumaTotal/a.size() + " Hay " + mayores + " numeros mayores a la media");

        // Ej 10)
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        ArrayList<Integer> b = new ArrayList<Integer>();
//        Random rand = new Random();
//
//        for(int i = 0; i < 5; i++){
//            a.add(rand.nextInt(10));
//        }
//        System.out.println("Array Original");
//        for(int j : a){
//            System.out.println(j);
//        }
//
//        for(int j = a.size() - 1; j >= 0; j--){
//            b.add(a.get(j));
//        }
//        System.out.println("Array Invertido");
//        for(int j : b){
//            System.out.println(j);
//        }

        // Ej 11)


        // 2.2. Cadenas y expresiones regulares

        // Ej 1)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ingrese una frase: ");
//        String frase = scan.nextLine();
//        String words[] = frase.split("\\s+");
//        System.out.println("La frase tiene " + words.length + " palabras");

        // Ej 2)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ingrese una frase: ");
//        String frase = scan.nextLine();
//        String oraciones[] = frase.split("\\.");
//        System.out.println("La frase tiene " + oraciones.length + " palabras");

        // Ej 3)

        // Ej 4)
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ingrese una frase: ");
//        String frase = scan.nextLine();
//        System.out.println("Frase original: " + frase);
//        String palabras[] = frase.split("\\s+");
//        String newArr[] = Arrays.copyOf(palabras, palabras.length - 1); // saca el ultimo elementos del array
//        frase = String.join(" ", newArr); // junta todos los elementos del array, y entre cada elemento agrega un espacio
//        System.out.println("Frase final: " + frase);

        // Ej 5)
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scan.nextLine();
        System.out.println("Ingrese la letra que desea contar (si ingresa mas de una letra se tomara solo la primera): ");
        char letra = scan.next().charAt(0);
        int i = 0;
        for(int j = 0; j<frase.length(); j++){
            if(frase.charAt(j) == letra){
                i++;
            }
        }
        System.out.println("La letra que inidico se repite " + i + " veces en la frase");

    }
}