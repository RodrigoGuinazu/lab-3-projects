import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Empleado> listado = new ArrayList<Empleado>();
        Empresa startUp = new Empresa(listado);

        int opcion;

        do{
            System.out.println("[1] Agregar un empleado");
            System.out.println("[2] Buscar por legajo");
            System.out.println("[3] Contar empleados");
            System.out.println("[4] Mostrar listado");
            System.out.println("[5] Eliminar por legajo");
            System.out.println("[6] Calcular el total a pagar de los empleados (sin contar los repartidores ya que no son empleados)");

            System.out.println("Ingrese una opcion o 0 para salir: ");
            opcion = scan.nextInt();

            switch(opcion){
                case 1 : {
                    Vendedor vendedor = new Vendedor(123345, "Vendedorr", "vendiendo", "Vieytes 443", 190000);
                    startUp.agregar(vendedor);
                    Administrativo administrativo = new Administrativo(991234, "Administrativo", "StarUp", "Urquiza 420", Area.FINANZAS);
                    startUp.agregar(administrativo);
                }break;

                case 2 : {
                    System.out.println("Ingrese el legajo que desea buscar: ");
                    int buscado = scan.nextInt();
                    Empleado aux = startUp.buscarPorLegajo(buscado);
                    if(aux.getLegajo() == 0){
                        System.out.println("El legajo no pertenece a ninguno de nuestros empleados");
                    }else{
                        System.out.println(aux);
                    }

                }break;

                case 3 : {
                    System.out.println("Hay " + startUp.contarEmpleados() + " empleados en la empresa");
                }break;

                case 4 : {
                    System.out.println(startUp.devolverListado());
                }break;

                case 5 : {
                    System.out.println("Ingrese el legajo que desea eliminar: ");
                    int buscado = scan.nextInt();
                    startUp.eliminarPorLegajo(buscado);
                    if(startUp.eliminarPorLegajo(buscado)){
                        System.out.println("Empleado eliminado con exito!");
                    }else {
                        System.out.println("El empleado que desea eliminar no existe en el sistema");
                    }
                }break;

                case 6 : {
                    startUp.calcularTotalPagar();
                    System.out.println("El total de sueldos a pagar es de $" + startUp.getTotalPagar());
                }break;
            }

        }while(opcion != 0);
    }
}
