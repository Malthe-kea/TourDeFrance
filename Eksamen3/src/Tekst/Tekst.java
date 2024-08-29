package Tekst;

import java.util.ArrayList;

public class Tekst {
    private ArrayList<String> tekstLinjer = new ArrayList<>();

    public Tekst(){
       ArrayList tekstLinjer;
    }

    public void tilføj(String stringInput){
        tekstLinjer.add(stringInput);
    }

    public int findAntalUnikke(){
        ArrayList<String> tempArr = new ArrayList<>();

        for(String s : tekstLinjer){
            if(!tempArr.contains(s)){
                tempArr.add(s);
            }
        }
        return tempArr.size();
    }
}
