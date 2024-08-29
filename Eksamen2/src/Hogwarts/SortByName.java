package Hogwarts;

import java.util.Comparator;

public class SortByName implements Comparator<HogwartsStudent> {

    @Override
    public int compare(HogwartsStudent o1, HogwartsStudent o2) {
        return o1.getLastName().toLowerCase().compareTo(o2.getLastName().toLowerCase());
    }
}
