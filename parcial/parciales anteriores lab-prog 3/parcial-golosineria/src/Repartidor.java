import java.util.Date;

public class Repartidor implements Sueldo {
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected Date fechaNacimiento;
    protected double kmsRecorridos;

    public Repartidor(){

    }

    public Repartidor(String nombre, String apellido, String direccion, Date fechaNacimiento, double kmsRecorridos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.kmsRecorridos = kmsRecorridos;
    }

    @Override
    public double cobrarSueldo() {
        return this.kmsRecorridos*3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
