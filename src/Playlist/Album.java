package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    public Song findSong(String title) {
        for (Song searched: this.songs) {
            if (searched.getTitle().equals(title)) {
                return searched;
            }
        }
        return null;
    }
    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        int index = track -1;
        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song searched = findSong(title);
        if (searched != null) {
            playlist.add(searched);
            return true;
        }
        return false;
    }
}
