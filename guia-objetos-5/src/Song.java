import java.util.List;
import java.util.Scanner;

public class Song implements Comparable { // implemento la interfaz comparable para poder hacer override del metodo compareTo()
    protected String name;
    protected int duration; // en segundos
    protected Genre genre;
    protected Album album;
    protected Artist feat; // artistas (1er artista principal, el resto invitados)

    public Song(){

    }

    public Song(String name, int duration, Genre genre, Album album, Artist feat) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.feat = feat;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public Album getAlbum() {
        return album;
    }

    public Artist getFeat() {
        return feat;
    }

    public static Song findSong(List<Song> songs){
        int flag = 0;
        Song rta = new Song();
        while(flag == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Que cancione quieres?");
            String name = scan.nextLine();

            for (Song s : songs) {
                if (name.equalsIgnoreCase(s.getName())) {
                    rta = s;
                    flag = 1;
                }
            }

            if (flag == 0) {
                System.out.println("La cancion que buscas no existe, intentalo nuevamente");
            }
        }
        return rta;
    }

    @Override
    public boolean equals(Object obj){
        Song s = (Song) obj;
        if(this.name.equalsIgnoreCase(s.getName())){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object obj){
        Song s = (Song) obj;
        if(this.getDuration() > s.getDuration()){
            return 1; // si devuelve un nro mayor a 0 el objeto que llama al metodo es el de mayor duracion
        }else if(this.getDuration() < s.getDuration()){
            return -1; // si devuelve un nro menor a 0 el objeto que pasamos por parametro es el de mayor duracion
        }else{
            return 0; // si devuelve un nro igual a 0 ambos objetos tienen la misma duracion
        }
    }

    @Override
    public String toString() {
        return "\nSong{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", album=" + album +
                ", feat=" + feat +
                '}';
    }
}
