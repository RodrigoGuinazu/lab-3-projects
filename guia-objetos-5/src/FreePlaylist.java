import java.util.Stack;

public class FreePlaylist implements Playback{

    protected String name;
    protected Stack<Song> myList;

    FreePlaylist(String name){
        this.name = name;
        this.myList = new Stack<Song>();
    }

    public Stack<Song> getMyList(){
        return this.myList;
    }

    @Override
    public void playSong() {
        // solo toca el primer tema del stack
        Song currentSong = myList.pop();
        // Debe mostrar la canción en reproducción, junto con el nombre del álbum, género y nombre del artista junto con el artista invitado si es que hay
        System.out.println("Suena el tema: " + currentSong.name + " del album " + currentSong.album + ". Su genero es: " + currentSong.genre  + " del artista " + currentSong.album.artist + (currentSong.feat != null ? " con el artista invitado " + currentSong.feat : "" ));
        // mandar la cancion al final de la cola
        Stack<Song> aux = new Stack<Song>();
        while(!myList.isEmpty()){
            aux.push(myList.pop());
        }
        myList.push(currentSong);
        while(!aux.isEmpty()){
            myList.push(aux.pop());
        }
    }

    @Override
    public void addSong(Song newSong) {
        myList.push(newSong);
    }

    @Override
    public void removeSong() {
        System.out.println("Para acceder a esta opcion, compre el paquete PREMIUM");
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
