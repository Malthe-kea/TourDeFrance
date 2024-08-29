package Opgave1;

public class AmateurAthlete extends Athlete{
    private boolean hasPaidFee;

    public AmateurAthlete(){

    }

    public boolean hasPaidFee(boolean hasPaidFee){
        if(hasPaidFee){
            return true;
        }
        return false;
    }
}
