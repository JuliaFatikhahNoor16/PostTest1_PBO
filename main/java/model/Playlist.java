package model;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;
    private static int totalSongs = 0;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        totalSongs++;
    }

    public void removeSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equalsIgnoreCase(title)) {
                songs.remove(i);
                totalSongs--;
                System.out.println("Song removed: " + title);
                return;
            }
        }
        System.out.println("Song not found: " + title);
    }

    public void displayPlaylist() {
        System.out.println("Playlist: " + name);
        for (Song song : songs) {
            song.displaySongInfo();  // Memanggil method displaySongInfo di Song
        }
    }

    public Song findSongByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        return null;
    }

    public static int getTotalSongs() {
        return totalSongs;
    }
}
