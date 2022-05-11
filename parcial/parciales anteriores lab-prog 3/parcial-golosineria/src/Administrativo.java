public class Administrativo extends Empleado implements Sueldo{
    protected Area area;

    public Administrativo() {
        super();
    }

    public Administrativo(int legajo, String nombre, String apellido, String direccion, Area area) {
        super(legajo, nombre, apellido, direccion);
        this.area = area;
    }

    @Override
    public double cobrarSueldo() {
        return 15.0;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area=" + area +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
