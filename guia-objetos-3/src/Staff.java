public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff(String dni, String nombre, String apellido, String mail, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, mail, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
