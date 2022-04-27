import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List artists = new ArrayList<Artist>();
        List genres = new ArrayList<Genre>();
        List albums = new ArrayList<Album>();
        List songs = new ArrayList<Song>();

        Artist artist1 = new Artist("Metallica", 40, "United States");
        Artist artist2 = new Artist("Beethoven", 56, "Austria");
        Artist artist3 = new Artist("Eminem", 50, "United States");
        Artist artist4 = new Artist("Dua Lipa", 26, "United Kingdom");
        Artist artist5 = new Artist("Soda Stereo", 35, "Argentina");
        Artist artist6 = new Artist("Drake", 42, "United States");
        Artist artist7 = new Artist("Louis Amstrong", 70, "United States");
        Artist artist8 = new Artist("Dr. Dre", 61, "United States");
        Artist artist9 = new Artist("Elton John", 74, "United Kingdom");
        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);
        artists.add(artist4);
        artists.add(artist5);
        artists.add(artist6);
        artists.add(artist7);
        artists.add(artist8);
        artists.add(artist9);

        Genre genre1 = new Genre("Rock");
        Genre genre2 = new Genre("Trap");
        Genre genre3 = new Genre("Jazz");
        Genre genre4 = new Genre("Hip Hop");
        Genre genre5 = new Genre("Pop");
        Genre genre6 = new Genre("Clasic");
        Genre genre7 = new Genre("Metal");
        genres.add(genre1);
        genres.add(genre2);
        genres.add(genre3);
        genres.add(genre4);
        genres.add(genre5);
        genres.add(genre6);
        genres.add(genre7);

        Album album1 = new Album("The Eminem Show", 2002, artist3);
        Album album2 = new Album("Master of Puppets", 1984, artist1);
        Album album3 = new Album("Nada Personal", 1985, artist5);
        Album album4 = new Album("Future Nostalgia", 2020, artist4);
        Album album5 = new Album("Scorpion", 2018, artist6);
        Album album6 = new Album("Symphony No. 9", 1823, artist2);
        Album album7 = new Album("What A Wonderful World", 1968, artist7);
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.add(album4);
        albums.add(album5);
        albums.add(album6);
        albums.add(album7);

        Song song1 = new Song("Battery", 380, genre7, album2, null);
        Song song2 = new Song("Cold Heart", 180, genre5, album4, artist9);
        Song song3 = new Song("Dream A Little Dream of Me", 190, genre3, album7, null);
        Song song4 = new Song("Ode to Joy", 600, genre6, album6, null);
        Song song5 = new Song("Cuando Pase El Temblor", 220, genre1, album3, null);
        Song song6 = new Song("Say What You Say", 300, genre4, album1, artist8);
        Song song7 = new Song("God's Plan", 150, genre2, album5, null);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        songs.add(song6);
        songs.add(song7);

        int option1, option2, option3;
        char pause = 'a';
        PremiumPlaylist premiumPlaylist;
        FreePlaylist freePlaylist;

        do{
            System.out.println("Spotify");
            System.out.println("[1] Ver todas las canciones");
            System.out.println("[2] Crear una Playlist Basica");
            System.out.println("[3] Crear una Playlist Premium");

            System.out.println("Ingrese una opcion o 0 para salir: ");
            option1 = scan.nextInt();

            switch (option1) {
                case 1 : {
                    System.out.println("Listado de Canciones");
                    System.out.println(songs);
                }break;

                case 2 : {
                    System.out.println("Ingrese el nombre de la playlist: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    freePlaylist = new FreePlaylist(name);
                    do{
                        System.out.println("Playlist Basica");
                        System.out.println("[1] Escuchar una cancion");
                        System.out.println("[2] Agregar una cancion");
                        System.out.println("[3] Eliminar una cancion");
                        System.out.println("[4] Mostrar la Playlist");

                        System.out.println("Ingrese una opcion o 0 para salir: ");
                        option2 = scan.nextInt();

                        switch(option2){
                            case 1 : {
                                if(freePlaylist.getMyList().isEmpty()){
                                    System.out.println("La playlist se encuentra vacia, agrega algunas canciones e intentalo nuevamente");
                                }else{
                                    pause = 'a';
                                    while(pause != 'p'){
                                        scan.nextLine();
                                        freePlaylist.playSong();
                                        System.out.println("Ingresa la letra 'p' para pausar la cancion e ir al menu principal");
                                        pause = scan.nextLine().charAt(0);
                                    }
                                }
                            }break;

                            case 2 : {
                                Song newSong = Song.findSong(songs);
                                freePlaylist.addSong(newSong);
                            }break;

                            case 3 : {
                                freePlaylist.removeSong();
                            }break;

                            case 4 : {
                                freePlaylist.myPlaylist();
                            }break;
                        }

                    }while (option2 != 0);
                }break;

                case 3 : {
                    System.out.println("Ingrese el nombre de la playlist: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    premiumPlaylist = new PremiumPlaylist(name);
                    do{
                        System.out.println("Playlist Premium");
                        System.out.println("[1] Escuchar una cancion");
                        System.out.println("[2] Agregar una cancion");
                        System.out.println("[3] Eliminar una cancion");
                        System.out.println("[4] Mostrar la Playlist");

                        System.out.println("Ingrese una opcion o 0 para salir: ");
                        option3 = scan.nextInt();

                        switch(option3){
                            case 1 : {
                                if(premiumPlaylist.getMyList().isEmpty()){
                                    System.out.println("La playlist se encuentra vacia, agrega algunas canciones e intentalo nuevamente");
                                }else{
                                    pause = 'a';
                                    while(pause != 'p'){
                                        scan.nextLine();
                                        premiumPlaylist.playSong();
                                        System.out.println("Ingresa la letra 'p' para pausar la cancion e ir al menu principal");
                                        pause = scan.nextLine().charAt(0);
                                    }
                                }
                            }break;

                            case 2 : {
                                Song newSong = Song.findSong(songs);
                                premiumPlaylist.addSong(newSong);
                            }break;

                            case 3 : {
                                premiumPlaylist.removeSong();
                            }break;

                            case 4 : {
                                premiumPlaylist.myPlaylist();
                            }break;
                        }

                    }while (option3 != 0);
                }break;
            }
        }while(option1 != 0);
    }
}