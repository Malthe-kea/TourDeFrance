package Hogwarts;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> HSArr = new ArrayList<>();

        HogwartsStudent h = new HogwartsStudent("Malthe", "Tiufkær", "slytherin");
        HogwartsStudent h2 = new HogwartsStudent("Lars", "Hummelshøj", "hufflepuff");
        HogwartsStudent h3 = new HogwartsStudent("Ib", "Frandsen", "ravenclaw");
        HogwartsStudent h4 = new HogwartsStudent("Kathrine", "Røvhul", "gryffindor");
        HogwartsStudent h5 = new HogwartsStudent("Isahn", "Xenomorph", "ravenclaw");
        HogwartsStudent h6 = new HogwartsStudent("Ritt", "Bjerregaard", "ravenclaw");

        HSArr.add(h.getLastName());
        HSArr.add(h2.getLastName());
        HSArr.add(h3.getLastName());
        HSArr.add(h4.getLastName());
        HSArr.add(h5.getLastName());
        HSArr.add(h6.getLastName());


        Collections.sort(HSArr);

        for (int i = 0; i < HSArr.size(); i++) {
            System.out.println(HSArr.get(i));
        }
    }
}
