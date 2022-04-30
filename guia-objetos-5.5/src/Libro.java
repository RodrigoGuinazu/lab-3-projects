public class Libro extends Lectura implements Alquilable{
    protected Genero genero;

    public Libro(int codigo, int fechaPublicacion, boolean disponibilidad, String titulo, Genero genero) {
        super(codigo, fechaPublicacion, disponibilidad, titulo);
        this.genero = genero;
    }

    @Override
    public void alquilar(){
        if(this.getDisponibilidad()){
            System.out.println("Alquilado con exito!");
            this.setDisponibilidad();
        }else{
            System.out.println("El libro/revista se encuentra alquilado");
        }
    }

    @Override
    public void devolver(){
        if(!this.getDisponibilidad()){
            System.out.println("Devuelto con exito!");
            this.setDisponibilidad();
        }else{
            System.out.println("El libro/revista no se encuentra alquilado, por lo tanto no puede ser devuelto");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "genero=" + genero +
                ", codigo=" + codigo +
                ", fechaPublicacion=" + fechaPublicacion +
                ", disponibilidad=" + disponibilidad +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
