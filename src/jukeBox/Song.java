package jukeBox;

import java.util.UUID;

/**
 * Created by btamara on 2017.06.06..
 */
public class Song {

    String artist;
    String title;
    String songId;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.songId = UUID.randomUUID().toString();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String id) {
        this.songId = id;
    }
}
