import java.util.ArrayList;

public class Agencia {
    // wrapper
    protected ArrayList<Vehiculo> vehiculos;
    protected static double totalRecaudado = 0;

    public Agencia() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    public void cargarAgenica(){
        Remis remis1 = new Remis("Peugot", "207", "Diesel", "PR123GG", 12);
        Remis remis2 = new Remis("Chevrolet", "Corsa", "Gas", "ABC123", 9);
        Remis remis3 = new Remis("Ford", "Mustang", "Diesel", "LZ989MB", 30);
        Taxi taxi1 = new Taxi("Ford", "Fiesta", "Diesel", "AA123FE", 30000, 150, 100);
        Taxi taxi2 = new Taxi("Volkswagen", "Gol Trend", "Gas", "APP420", 130000, 130, 110);
        Taxi taxi3 = new Taxi("Peugot", "3008", "Diesel", "AF151FE", 15000, 190, 120);

        this.vehiculos.add(remis1);
        this.vehiculos.add(remis2);
        this.vehiculos.add(remis3);
        this.vehiculos.add(taxi1);
        this.vehiculos.add(taxi2);
        this.vehiculos.add(taxi3);
    }

    public StringBuilder mostrarVehiculos(){
        StringBuilder rta = new StringBuilder();
        for(Vehiculo v : this.vehiculos){
            rta.append(v);
            rta.append("\n");
        }
        return rta;
    }

    public Vehiculo conseguirVehiculoLibre(){
        Vehiculo rta = null;
        for(Vehiculo v : this.vehiculos){
            if(v.getLibre()){
                rta = v;
            }
        }
        return rta;
    }

    public void cancelarTodosLosViajes(){
        for(Vehiculo v : vehiculos){
            if(!v.getLibre()){
                v.setLibre();
            }
        }
    }

    public static void recaudar(double dinero){
        totalRecaudado += dinero;
    }

    public static double getTotalRecaudado(){
        return totalRecaudado;
    }
}
