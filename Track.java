// Surname: Isaacs
// Name: Kaamiel
// Student no: 4129581
// Course: CSC211
// Year: 2023
// Assignment: Practical 1 Term 2
// File: Track.java

public class Track {
    private String id;
    private String title;
    private String artist;
    private String album;
    private int minutes;
    private int seconds;
    private Track left;
    private Track right;

// DEFAULT CONSTRUCTOR
public Track() {
    this.id = "";
    this.title = "";
    this.artist = "";
    this.album = "";
    this.minutes = 0;
    this.seconds = 0;
    this.left = null;
    this.right = null;
        
    }

// LOADED CONSTRUCTOR
public Track(String id, String title, String artist, String album, int minutes, int seconds) {
    this.id = id;
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.minutes = minutes;
    this.seconds = seconds;
    this.left = null;
    this.right = null;
    }

    // ACCESSOR METHODS
    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getAlbum(){
        return album;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public Track getLeft() {
        return left;
    }

    public Track getRight() {
        return right;
    }

// MUTATOR METHOD
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setLeft(Track left) {
        this.left = left;
    }

    public void setRight(Track right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Track title: " + title + "\nArtist name: " + artist + "\nAlbum title: " +
                album + "\nTrack time: " + minutes + " min " + seconds + " sec";
    }
}