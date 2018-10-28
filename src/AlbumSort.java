import java.util.*;

public class AlbumSort {

    public static void main(String[] args) {
        Album a1 = new Album ("James Blake", "James Blake", 2011);
        Album a2 = new Album ("Overgrown", "James Blake", 2013);
        Album a3 = new Album ("The Colour in Anything", "James Blake", 2018);
        Album a4 = new Album ("Roosevelt", "Roosevelt", 2016);
        Album a5 = new Album ("Young Romance", "Roosevelt", 2018);
        Album a6 = new Album ("Saw You In A Dream", "The Japanese House", 2017);
        Album a7 = new Album ("Clean", "The Japanese House", 2015);
        Album a8 = new Album ("Pools To Bathe In", "The Japanese House", 2015);
        Album a9 = new Album ("Cool Blue", "The Japanese House", 2015);
        List<Album> albums = new ArrayList<>();
        albums.add(a1);
        albums.add(a2);
        albums.add(a3);
        albums.add(a4);
        albums.add(a5);
        albums.add(a6);
        albums.add(a7);
        albums.add(a8);
        albums.add(a9);
        Collections.sort (albums, ORDER);
        System.out.println(albums.toString());

    }
        static final Comparator<Album> ORDER = new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                int artistCmp= a1.getArtist().compareTo(a2.getArtist());
                if (artistCmp != 0) return artistCmp;

                int dateCmp =((a1.getReleaseYear() < a2.getReleaseYear() ? -1 :
                        (a1.getReleaseYear() == a2.getReleaseYear() ? 0 : 1)));
                if (dateCmp != 0) return dateCmp;

                int nameCmp = a1.getName().compareTo(a2.getName());
                return nameCmp;
            }
        };
    }

