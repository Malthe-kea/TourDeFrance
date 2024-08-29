package Opgave1;

import java.util.ArrayList;

public class ProfessionalAthlete extends Athlete{
    private ArrayList<Integer> listOfPoints = new ArrayList<>();
    public ProfessionalAthlete(){
        super();
    }

    public ArrayList<Integer> getNumberOfWins(){
        return listOfPoints;
    }
}
