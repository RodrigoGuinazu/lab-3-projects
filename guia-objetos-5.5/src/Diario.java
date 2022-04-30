public class Diario extends Lectura implements Legible{

    public Diario(int codigo, int fechaPublicacion, boolean disponibilidad, String titulo) {
        super(codigo, fechaPublicacion, disponibilidad, titulo);
    }

    @Override
    public void sacarParaLeer(){
        if(this.getDisponibilidad()){
            System.out.println("Sacado para leer!");
            this.setDisponibilidad();
        }else{
            System.out.println("El diario se encuentra en uso");
        }
    }

    @Override
    public void devolver(){
        if(!this.getDisponibilidad()){
            System.out.println("Devuelto con exito!");
            this.setDisponibilidad();
        }else{
            System.out.println("El diario no esta en uso, por lo tanto no puede ser devuelto");
        }
    }

    @Override
    public String toString() {
        return "Diario{" +
                "codigo=" + codigo +
                ", fechaPublicacion=" + fechaPublicacion +
                ", disponibilidad=" + disponibilidad +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
