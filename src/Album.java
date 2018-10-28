import java.util.*;
public class Album {
    String name;
    String artist;
    int releaseYear;

    public Album(String name, String artist, int releaseYear) {
        this.name = name;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    public String toString(){
        return name + " by " + artist + " in " + releaseYear;
    }

    public String getArtist() {
        return artist;
    }

    public int getReleaseYear() {
        return  releaseYear;
    }
    public String getName() {
        return name;
    }
}
