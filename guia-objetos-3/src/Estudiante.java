public class Estudiante extends Persona{
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(String dni, String nombre, String apellido, String mail, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, mail, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public double getCuotaMensual(){
        return this.cuotaMensual;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "anioIngreso=" + anioIngreso +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
