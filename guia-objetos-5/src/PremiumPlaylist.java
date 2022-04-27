import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PremiumPlaylist implements Playback{

    protected String name;
    protected List<Song> myList; // LinkedList. Lo llamo como List y no como LinkedList porque mas adelante puedo cambiarlo por un vector o arraylist

    PremiumPlaylist(String name){
        this.name = name;
        this.myList = new LinkedList<Song>();
    }

    public List<Song> getMyList(){
        return this.myList;
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public void playSong() {
        int flag = 0;
        Song currentSong = new Song(); // tuve que declarar la funcion constructora Song(sin parametros) en la clase Song. No venia por defecto?
        while(flag == 0){
            System.out.println("Que cancion quieres escuchar?");
            String rta = scan.nextLine();
            for(Song s : myList){
                if(rta.equalsIgnoreCase(s.getName())){
                    currentSong = s;
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("La cancion que buscas no se encuentra en tu playlist, intentalo nuevamente");
            }
        }
        System.out.println("Suena el tema: " + currentSong.name + " del album " + currentSong.album + ". Su genero es: " + currentSong.genre  + " del artista " + currentSong.album.artist + (currentSong.feat != null ? " con el artista invitado " + currentSong.feat : "" ));
    }

    @Override
    public void addSong(Song newSong) {
        myList.add(newSong);
    }

    @Override
    public void removeSong() {
        int flag = 0;
        while(flag == 0){
            System.out.println("Que cancion quieres eliminar?");
            String rta = scan.nextLine();
            for(Song s : myList){
                if(rta.equalsIgnoreCase(s.getName())){
                    myList.remove(s);
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("La cancion que buscas no se encuentra en tu playlist, intentalo nuevamente");
            }
        }
    }

    @Override
    public void myPlaylist() {
        if(this.myList.isEmpty()){
            System.out.println("La playlist se encuentra vacia, agrega algunas canciones e intentalo nuevamente");
        }else{
            System.out.println("Playlist: " + this.name);
            for(Song s : myList){
                System.out.println(s.toString());
            }
        }
    }
}
