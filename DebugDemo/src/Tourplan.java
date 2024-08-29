import java.util.ArrayList;

public class Tourplan {
    ArrayList<Venue> tourplan = new ArrayList<>();

    public Tourplan() {
    }

    public String getTourplan() {
        StringBuilder listString = new StringBuilder();
        for (Venue v : tourplan) {
            listString.append(v.toString() + "\n");
        }
        return listString.toString();
    }

    public String checkIfJylland(Venue t) {
        checkIfTicketPriceMakesItOkayToPlayInJyllandAnyways(t);
        if (!t.isInJylland()) {
            tourplan.add(t);
            return t.getName() + " is not in Jylland - ACCEPTED";
        } else
            return t.getName() + " is in Jylland - DISCARDED";
    }

    public void checkIfTicketPriceMakesItOkayToPlayInJyllandAnyways(Venue v) {
        if (v.getTicketPrice() > 600) {
            tourplan.add(v);
        }
    }
}
