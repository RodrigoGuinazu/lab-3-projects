public class Autor {
    private String nombre;
    private String apellido;
    private String mail;
    private char genero;

    public Autor(String nombre, String apellido, String mail, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.genero = genero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    @Override
    public String toString() {
        return  "nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", mail: '" + mail + '\'' +
                ", genero: " + genero;
    }
}
