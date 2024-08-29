package Opgave2;

public class Song {
    private String title;
    private String artist;
    private int durationInSeconds;
    public Song(String artist, String title, int durationInSeconds){
        this.artist = artist;
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
