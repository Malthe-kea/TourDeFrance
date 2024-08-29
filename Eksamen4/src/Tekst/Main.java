package Tekst;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        FileWriter file = new FileWriter("jegtesterligenoget.txt");
        Tekst tekst = new Tekst();

        tekst.tilføjTekst("hej");
        tekst.tilføjTekst("Ja okay");
        tekst.tilføjTekst("hej");



        try {
            file.write(tekst.toString());
            System.out.println("The files has been created");
            file.close();
        } catch (FileNotFoundException FNFE) {
            System.out.println("the file has not been found");
        }

        System.out.println(tekst.findAntalUnikke());
    }
}
