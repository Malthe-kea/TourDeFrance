package Tekst;

import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> tekstlinjer = new ArrayList<>();

    public Tekst() {

    }

    public void tilføj(String stringInput) {
        tekstlinjer.add(stringInput);
    }

    public int findAntalUnikke() {
        //Her kan man bruge Set<String>-utility.
        ArrayList<String> tempArr = new ArrayList<>();

        for (int i = 0; i < tekstlinjer.size(); i++) {
            if (!(tempArr.contains(tekstlinjer.get(i)))) {
                tempArr.add(tekstlinjer.get(i));
            }
        }
        return tempArr.size();
    }
}
