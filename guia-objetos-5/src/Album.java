public class Album {
    protected String title;
    protected int year;
    protected Artist artist;

    public Album(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", artist=" + artist +
                '}';
    }
}
