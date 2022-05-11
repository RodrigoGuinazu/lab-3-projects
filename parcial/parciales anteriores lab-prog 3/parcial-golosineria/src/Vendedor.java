public class Vendedor extends Empleado implements Sueldo {
    protected double montoMensual;

    public Vendedor() {
        super();
    }

    public Vendedor(int legajo, String nombre, String apellido, String direccion, float montoMensual) {
        super(legajo, nombre, apellido, direccion);
        this.montoMensual = montoMensual;
    }

    @Override
    public double cobrarSueldo() {
        return this.montoMensual*0.3;
    }

    public double getMontoMensual() {
        return montoMensual;
    }

    public void setMontoMensual(float montoMensual) {
        this.montoMensual = montoMensual;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "montoMensual=" + montoMensual +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
