public class Revista extends Lectura implements Alquilable{

    public Revista(int codigo, int fechaPublicacion, boolean disponibilidad, String titulo) {
        super(codigo, fechaPublicacion, disponibilidad, titulo);
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
        return "Revista{" +
                "codigo=" + codigo +
                ", fechaPublicacion=" + fechaPublicacion +
                ", disponibilidad=" + disponibilidad +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
