import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {
    private static int intento = 0;
    public static void numeroAlAzar(int nro) throws InputMismatchException, NumeroIncorrectoException{
        Scanner scan = new Scanner(System.in);
        int rta;

        try {
            System.out.println("Intento " + Juego.intento);
            System.out.println("Ingrese un nro: ");
            rta = scan.nextInt();
            Juego.intento++;
        }catch (InputMismatchException e){
            throw new InputMismatchException();
        }

        if(rta == nro){
            System.out.println("Adivinaste el numero!");
        }
        else if(rta > nro){
            System.out.println("El numero que ingresaste es mayor al que tienes que adivinar");
            throw new NumeroIncorrectoException();
        }else if(rta < nro){
            System.out.println("El numero que ingresaste es menor al que tienes que adivinar");
            throw new NumeroIncorrectoException();
        }
    }
}
