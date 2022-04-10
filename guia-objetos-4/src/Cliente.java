import java.util.ArrayList;

public class Cliente {
    protected String dni;
    protected String nombre;
    protected String telefono;
    protected String direccion;
    protected ArrayList<Alquiler> alquileres;
    protected ArrayList<Alquiler> alquileresVigentes;

    public Cliente(String dni, String nombre, String telefono, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        alquileres = new ArrayList<Alquiler>();
        alquileresVigentes = new ArrayList<Alquiler>();
    }

    static Cliente buscarCliente(String dni, ArrayList<Cliente> clientes){
        Cliente rta = null;
        for(Cliente c : clientes){
            if(dni.equals(c.dni)){
                rta = c;
            }
        }
        return rta;
    }

    public void setAlquileres(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    public ArrayList<Alquiler> getAlquileres(){
        return alquileres;
    }

    public ArrayList<Alquiler> getAlquileresVigentes(){
        return alquileresVigentes;
    }

    public void setAlquileresVigentes(Alquiler a){
        alquileresVigentes.add(a);
    }

    public void resetAlquileresVigentes(){
        alquileresVigentes = null;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion +
                '}';
    }
}
