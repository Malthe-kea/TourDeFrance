package Media;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Media> mediaList = new ArrayList<>();
        File myFile = new File("Media2.txt");

        Video video1 = new Video("Sej video",10.2, "19:31");
        Audio audio1 = new Audio("Amazing lyd", 12541.13, "1923.123.Db");

        mediaList.add(video1);
        mediaList.add(audio1);

        try{
            myFile.createNewFile();
        } catch (IOException e){
            System.out.println(e);
        }

        try{
            PrintStream out = new PrintStream(myFile);
            for (Media m : mediaList){
                out.println(m.toString());
            }
        } catch (FileNotFoundException FNFE){
            System.out.println(FNFE);
        }




    }
}
