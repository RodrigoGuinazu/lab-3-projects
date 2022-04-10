import java.util.ArrayList;
import java.util.Scanner;

public class Copia extends Pelicula{
    protected static int nextId = 1;
    protected int id;
    protected boolean alquilado;
    protected int vecesAlquilada;

    public Copia(String titulo, int estreno, int duracion,String genero, String clasificacion, String origen, String descripcion) {
        super(titulo, estreno, duracion, genero, clasificacion, origen, descripcion);
        this.id = nextId;
        nextId++;
        this.alquilado = false;
        this.vecesAlquilada = 0;
    }

    static ArrayList<Copia> buscarPelicula(ArrayList<Copia> peliculas, String tituloBuscado){ // al hacer la funcion static puedo llamar a la funcion sin necesidad de instanciar
        ArrayList<Copia> resultado = new ArrayList<Copia>();
        for(Copia p : peliculas){
            if(p.titulo.contains(tituloBuscado)){
                resultado.add(p);
            }
        }
        return resultado;
    }

    static ArrayList<Copia> alquilarPeliculas(ArrayList<Copia> peliculas){
        Scanner scan = new Scanner(System.in);
        ArrayList<Copia> alquileres = new ArrayList<Copia>();
        int flag = 0;
        char control = 's';
        while(control == 's'){
            System.out.println("Ingrese el id de la pelicula a alquilar");
            int id = scan.nextInt();
            for(Copia p : peliculas){
                if(p.id == id){
                    flag = 1;
                    if(p.alquilado == false){
                        p.setAlquilado();
                        alquileres.add(p);
                    }else{
                        System.out.println("La pelicula que seleccionaste ya se encuentra alquilada");
                    }
                }
            }
            if(flag == 0){
                System.out.println("Esa pelicula no existe en el catalogo");
            }
            flag = 0;
            System.out.println("Deseas alquilar otra pelicula? (s/n)");
            control = scan.next().charAt(0);
        }
        return alquileres;
    }

    static ArrayList<Copia> ordenarPorGenero(ArrayList<Copia> ordenadoPorPopularidad, String genero){
        ArrayList<Copia> ordenada = new ArrayList<Copia>();
        for (Copia p : ordenadoPorPopularidad){
            if(p.getGenero().equals(genero)){
                ordenada.add(p);
            }
        }
        return ordenada;
    }

    public void setAlquilado(){
        this.alquilado = true;
        vecesAlquilada++;
    }

    public void setDevuelto(){
        this.alquilado = false;
    }

    public void aumentarVecesAlquilado(int agregar){
        this.vecesAlquilada += agregar;
    }

    public int getVecesAlquilado(){
        return this.vecesAlquilada;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getInfo(){
        return (
                "\nTitulo: " + titulo +
                "\nEstreno: " + estreno +
                "\nDuracion: " + duracion +
                "\nGenero: " + genero +
                "\nClasificaion: " + clasificacion +
                "\nOrigen: " + origen +
                "\nDescripcion: " + descripcion +
                "\nID: " + this.id +
                "\nAlquilado: " + this.alquilado +
                "\nVeces Alquilada: " + vecesAlquilada
                );
    }

    @Override
    public String toString() {
        return "Copia{" +
                "titulo=" + titulo +
                ", id=" + id +
                ", alquilado=" + alquilado +
                ", vecesAlquilada=" + vecesAlquilada +
                '}';
    }
}
