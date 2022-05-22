import java.util.ArrayList;

public class Local{
    protected String nombre;
    protected ArrayList<Plato> platos;
    protected ArrayList<Pago> mediosDePago;

    public Local(String nombre, ArrayList<Plato> platos, ArrayList<Pago> mediosDePago) {
        this.nombre = nombre;
        this.platos = platos;
        this.mediosDePago = mediosDePago;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }


    public ArrayList<Pago> getMediosDePago() {
        return mediosDePago;
    }

    @Override
    public String toString() {
        return "Local{" +
                "nombre='" + nombre + '\'' +
                ", platos=" + platos +
                ", mediosDePago=" + mediosDePago +
                '}';
    }
}
