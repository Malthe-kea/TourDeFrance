package BilOgTrailer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bil> bilArr = new ArrayList<>();
        Bil bil = new Bil(2000,4000, "Fiat");
        Bil bil1 = new Bil(250,4000,"Skoda");
        Bil bil2 = new Bil(1800,4000,"Skoda");
        Bil bil3 = new Bil(2500,4000, "Fiat");
        Bil bil4 = new Bil(3200,4000, "Ferrari");
        Bil bil5 = new Bil(4010,4000,"Opel");

        bilArr.add(bil);
        bilArr.add(bil2);
        bilArr.add(bil3);
        bilArr.add(bil4);
        bilArr.add(bil5);


        Collections.sort(bilArr, new SortByWeight());

        for (int i = 0; i < bilArr.size(); i++) {
            System.out.println(bilArr.get(i));

        }

    }
}
