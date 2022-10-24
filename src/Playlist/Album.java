package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }
    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        Song check = this.songs.findSong(track);
        if (check != null) {
            playlist.add(check);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song check = songs.findSong(title);
        if (check != null) {
            playlist.add(check);
            return true;
        }
        return false;
    }
    public static class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song checked: this.songs) {
                if (checked.getTitle().equals(title)) {
                    return checked;
                }
            }
            return null;
        }

        private Song findSong(int track) {
            int index = track - 1;
            if (index >= 0 && index <= this.songs.size()) {
                return songs.get(index);
            }
            return null;
        }
    }
}
