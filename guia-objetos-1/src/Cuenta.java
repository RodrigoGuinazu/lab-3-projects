/**
 4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre y balance. Considere los getters, setters y constructores necesarios. Tenga en cuenta los siguientes métodos.
 a. El método crédito que representa un depósito de dinero en la cuenta. Este método debe devolver el balance luego de la operación.
 b. El método débito que representa una sustracción de dinero de la cuenta. Este método debe devolver el balance luego de la operación.
 Si el dinero en la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por pantalla un aviso.
 c. Un método que imprima por pantalla las características del objeto.
 Realice las siguientes operaciones:
 1. Inicialice una cuenta con un monto inicial de 15000.
 2. Realice una operación de crédito de 2500.
 3. Realice una operación de compra de 1500.
 4. Realice una operación de compra de 30000.
 5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
 correcto.
 */

public class Cuenta {
    private static int nextId = 1;
    private int id;
    private String name;
    private double balance;

    Cuenta(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.id = nextId;
        nextId++;
    }

    public void credito(double dinero){
        this.balance += dinero;
    }

    public void debito(double dinero){
        if(this.balance >= dinero){
            this.balance -= dinero;
        }else{
            System.out.println("No tienes los fondos suficientes para realizar esta operacion");
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getInfo(){
        return ("Id: " + this.id + "\nNombre: " + this.name + "\nBalance: $" + this.balance);
    }
}
