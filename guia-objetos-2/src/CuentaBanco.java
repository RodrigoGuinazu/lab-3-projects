import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

/**
 3. Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de un Cliente. Para esto identificamos los atributos id, nombre y género (M o F) para el Cliente.
 Por otro lado tenemos el tipo Cuenta que también posee un identificador, un balance y un Cliente que es el dueño de la cuenta.
 La Cuenta debe exponer los métodos depositar y extraer que modifican el balance de la misma.
 Algo a tener en cuenta es que el método extraer no puede extraer dinero si el balance total no lo permite,
 si esto sucede se debe imprimir un mensaje por pantalla que indique que la cuenta no posee saldo suficiente.
 a. Crear un Cliente e imprimirlo en pantalla.
 b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de 10000.
 c. Realizar operaciones de depósito y extracción para probar esa funcionalidad.
 d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,de máximo 2000 pesos.
 Esto significa que la cuenta puede aceptar un balance negativo con un máximo de - 2000. Realice los cambios y pruebas necesarias.
 e. Analice cómo implementaría con las herramientas conocidas hasta el momento, llevar un registro de como máximo 10 operaciones de depósito y extracción que se realizaron en la cuenta.
 En donde se almacene en memoria de alguna forma la siguiente cadena de texto:
 i. Depósito: ​"El {NombreCliente}, depositó {MontoDepositado}"
 ii. Extracción: ​"El {NombreCliente}, retiró {MontoRetirado}"
 */

public class CuentaBanco {
    private UUID id;
    private double balance;
    private double saldoDeudor;
    private ClienteBanco cliente;
    private ArrayList<String> registro;

    public CuentaBanco(double balance, double saldoDeudor, ClienteBanco cliente) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.saldoDeudor = saldoDeudor;
        this.cliente = cliente;
        this.registro = new ArrayList<String>();
    }

    public void depositar(double dinero){
        this.balance += dinero;
        this.registro.add("Deposito de $" + dinero + " realizado con exito en la fecha: " + Calendar.getInstance().getTime());
        System.out.println("La operacion se realizo con extio, usted tiene un balance de: $" + this.balance);
    }

    public void extraer(double dinero){
        if(this.balance < dinero){
            if((this.balance - dinero) >= (this.saldoDeudor)*-1){
                this.balance = this.balance - dinero;
                this.registro.add("Extraccion de $" + dinero + " realizada con exito en la fecha: " + Calendar.getInstance().getTime());
                System.out.println("La operacion se realizo con extio, usted tiene un balance de: $" + this.balance);
            }else{
                System.out.println("No tienes la cantidad necesaria para realizar esta extraccion");
            }
        }else{
            this.balance -= dinero;
            this.registro.add("Extraccion de $" + dinero + " realizada con exito en la fecha: " + Calendar.getInstance().getTime());
            System.out.println("La operacion se realizo con extio, usted tiene un balance de: $" + this.balance);
        }
    }

    @Override
    public String toString() {
        return "CuentaBanco{" +
                "id=" + id +
                ", balance=" + balance +
                ", saldoDeudor=" + saldoDeudor +
                ", cliente=" + cliente +
                ", registro=" + registro +
                '}';
    }
}