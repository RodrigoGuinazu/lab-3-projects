import java.time.LocalDate;

public class Empleado {
    protected int legajo;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected LocalDate fechaNacimiento;

    public Empleado(){

    }

    public Empleado(int legajo){
        this.legajo = legajo;
    }
    public Empleado(int legajo, String nombre, String apellido, String direccion) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNacimiento = LocalDate.now();
    }

    @Override
    public boolean equals(Object obj) {
        Empleado e = (Empleado) obj;
        if(this.legajo == e.getLegajo()){
            return true;
        }else {
            return false;
        }
    }

    public int getLegajo() {
        return legajo;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
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

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "\n\nEmpleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
