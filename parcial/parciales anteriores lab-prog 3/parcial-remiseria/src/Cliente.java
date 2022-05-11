public class Cliente {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String direccion;
    protected Vehiculo vehiculoEnUso;

    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.vehiculoEnUso = null;
    }

    public double pedirAuto(double kms, Vehiculo v){
        this.vehiculoEnUso = v;
        v.setLibre();
        double rta = v.precioViaje(kms);
        Agencia.recaudar(rta);
        return rta;
    }

    public void terminarViaje(){
        this.vehiculoEnUso.setLibre();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
