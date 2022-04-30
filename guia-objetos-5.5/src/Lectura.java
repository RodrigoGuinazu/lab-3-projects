import java.util.List;
import java.util.Scanner;

public class Lectura {
    protected int codigo;
    protected int fechaPublicacion;
    protected boolean disponibilidad; // alquilado/en uso
    protected String titulo;

    public Lectura(){

    }
    public Lectura(int codigo, int fechaPublicacion, boolean disponibilidad, String titulo) {
        this.codigo = codigo;
        this.fechaPublicacion = fechaPublicacion;
        this.disponibilidad = disponibilidad;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean getDisponibilidad(){
        return this.disponibilidad;
    }

    public void setDisponibilidad(){
        if(this.disponibilidad == true){
            this.disponibilidad = false;
        }else{
            this.disponibilidad = true;
        }
    }

    static public Lectura buscarLectura(List<Lectura> listado){
        Scanner scan = new Scanner(System.in);
        String nombre;
        Lectura aux = new Lectura();
        int flag = 0;
        while(flag == 0){
            System.out.println("Ingrese el titulo de la lectura");
            nombre = scan.nextLine();
            for(Lectura l : listado){
                if(nombre.equalsIgnoreCase(l.getTitulo())){
                    flag = 1;
                    aux = l;
                }
            }
            if(flag == 0){
                System.out.println("La lectura que usted quiere no existe, intente nuevamente");
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return "\nLectura{" +
                "codigo=" + codigo +
                ", fechaPublicacion=" + fechaPublicacion +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
