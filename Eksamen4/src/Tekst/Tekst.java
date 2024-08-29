package Tekst;

import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> tekstlinjer = new ArrayList<>();

    public Tekst(){
    }
    public void tilføjTekst(String s){
        tekstlinjer.add(s);
    }

    public int findAntalUnikke(){
        ArrayList<String> tempList = new ArrayList<>();
        for(String s : tekstlinjer) {
            if (!tempList.contains(s)) {
                tempList.add(s);
            }
        }
        return tempList.size();
    }

    @Override
    public String toString() {
        return "Filen indeholder: "+ tekstlinjer;
    }
}
