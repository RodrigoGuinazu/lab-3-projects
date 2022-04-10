/**
 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador, descripción, cantidad y precio unitario.
 Cree los métodos para calcular el precio total teniendo en cuenta el precio unitario y cantidad. Un método que permita imprimir por pantalla los atributos del objeto de la siguiente forma:
 ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
 a. Inicialice el objeto con los atributos necesarios
 b. Imprima por pantalla el objeto inicializado.
 */

public class ItemDeVenta {
    private static int nextId = 1;
    private int id;
    private String description;
    private int quantity;
    private double price;

    ItemDeVenta(String description, int quantity, double price){
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.id = nextId;
        nextId++;
    }

    public double getTotal(){
        return this.quantity * this.price;
    }

    public String getInfo(){
        return ("Id: " + this.id + "\nDescripcion: " + this.description + "\nCantidad: " + this.quantity + "\nPrecio Unitario: " + this.price + "\nPrecio Total: " + this.getTotal());
    }


}
