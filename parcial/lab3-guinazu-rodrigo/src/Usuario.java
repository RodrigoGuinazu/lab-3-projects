public class Usuario {
    protected String mail;
    protected String nombre;
    protected String telefono;
    protected String direccion;

    public Usuario(String mail, String nombre, String telefono, String direccion) {
        this.mail = mail;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "mail='" + mail + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
