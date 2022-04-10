public class Main {
    public static void main(String[] args) {

        // EJ 1)

//        Autor joshua = new Autor("Joshua", "Block", "joshua@email.com", 'M');
//        Autor george = new Autor("George", "Orwell", "orwell@email.com", 'M');
//        Autor mary = new Autor("Mary", "Shelly", "shelly@email.com", 'F');
////        System.out.println(joshua.toString());
//        ArrayList<Autor> autores = new ArrayList<Autor>();
//        autores.add(joshua);
//        autores.add(george);
//        autores.add(mary);
//        Libro librito = new Libro("Effective Java", 450, 150, autores);
//        System.out.println(librito.toString());
////        System.out.println(librito.toString());
////        librito.setPrecio(500);
////        librito.setStock(50);
////        System.out.println(librito.toString());
////        System.out.println(librito.getAutor());
////        System.out.println(librito.getFrase());

        // EJ 2)

//        Cliente cliente = new Cliente("Rodrigo Garcia", "rodri@hotmail.com", 25);
//        System.out.println(cliente.toString());
//        ArrayList<ItemVenta> items = new ArrayList<ItemVenta>();
//        ItemVenta item1 = new ItemVenta("Parlante", "Bluetooth con luces", 20000);
//        ItemVenta item2 = new ItemVenta("Monitor", "4k 144HZ", 80000.99);
//        ItemVenta item3 = new ItemVenta("Teclado", "Bluetooth con rgb", 12000);
//        items.add(item1);
//        items.add(item2);
//        items.add(item3);
//        Factura factura = new Factura(999.99, cliente, items);
//        System.out.println("Subtotal: $" + factura.subtotal());
//        System.out.println("Total a pagar (dto aplicado): $" + factura.totalAPagar());
////        System.out.println(factura.toString());

        // EJ 3)

        ClienteBanco cliente = new ClienteBanco("Rodrigo", 'M');
        System.out.println(cliente.toString());
        CuentaBanco cuenta = new CuentaBanco(10000, 1000, cliente);
        cuenta.depositar(1000);
        cuenta.extraer(12000);
        System.out.println(cuenta.toString());


    }
}
