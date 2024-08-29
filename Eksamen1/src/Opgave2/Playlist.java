package Opgave2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class Playlist {
    private ArrayList<Song> listOfSongs = new ArrayList<>();
    private FileHandler fileHandler = new FileHandler("");

    Song song1 = new Song("Hvid Sjokolade","Sjokoting",120);
    Song song2 = new Song("Blur","Song 2",120);

    public Playlist() throws IOException {
       listOfSongs.add(song1);
       listOfSongs.add(song2);
   }
   public int getTotalDuration(){
       int totalDurationInSeconds = 0;
       for (Song s : listOfSongs){
           totalDurationInSeconds += s.getDurationInSeconds();
       }
       return totalDurationInSeconds;
   }

    public void setListOfSongs(ArrayList<Song> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter("sange.csv");
        for (Song s : listOfSongs){

        }


    }

}
