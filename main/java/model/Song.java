package model;

public class Song {
    private String title;
    private String artist;
    private int duration;  // dalam detik
    private int year;      // tahun rilis

    // Constructor
    public Song(String title, String artist, int duration, int year) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.year = year;
    }

    // Getter dan Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display song information
    public void displaySongInfo() {
        System.out.println("+----------------------------------------+");
        System.out.println("| Title    : " + title);
        System.out.println("| Artist   : " + artist);
        System.out.println("| Duration : " + duration + " sec");
        System.out.println("| Year     : " + year);
        System.out.println("+----------------------------------------+");
    }
}
