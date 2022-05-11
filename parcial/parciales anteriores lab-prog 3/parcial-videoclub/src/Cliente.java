import java.util.ArrayList;

public class Cliente {
    protected static int nextId;
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String telefono;
    protected ArrayList<Copia> alquilados;

    public Cliente(String nombre, String apellido, String dni, String telefono) {
        this.id = nextId;
        nextId++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.alquilados = new ArrayList<Copia>();
    }

    public void agregarAlListado(Copia c){
        this.alquilados.add(c);
    }

    public void devolver(Copia c){
        c.devolver();
        Alquilable.restarAlquilados();
    }

    public void devolverTodo(){
        for(Copia c : this.alquilados){
            c.devolver();
            Alquilable.restarAlquilados();
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
