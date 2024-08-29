package BilOgTrailer;

import java.util.Comparator;

public class SortByWeight implements Comparator<Bil> {

    public SortByWeight(){
    }

    @Override
    public int compare(Bil b1, Bil b2) {
        return b1.getModel().toLowerCase().compareTo(b2.getModel().toLowerCase());
    }
}
