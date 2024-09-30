package model;

public class Song {
    private String title;
    private String artist;
    private String duration;  
    private int year;      

    public Song(String title, String artist, String duration, int year) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.year = year;
    }

    public Song(String title, String artist, int duration, int year) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    public String getDuration() {
        return duration;
    }

    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displaySongInfo() {
        System.out.println("+----------------------------------------+");
        System.out.println(" Title    : " + title);
        System.out.println(" Artist   : " + artist);
        System.out.println(" Duration : " + duration + " min");
        System.out.println(" Year     : " + year);
        System.out.println("+----------------------------------------+");
    }

    public void setDuration(int newDuration) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
