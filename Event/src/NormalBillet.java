public class NormalBillet extends Billet{
    private int billetPris = 150;
    private String billettype = "dørbillet";
    private final int eventDato = 30;
    private int rabatIProcent = 15;
    public NormalBillet(int iD, int eventDato) {

    }

    @Override
    public int tjekForsalgsRabat() {
        if (eventDato < 10 && eventDato >= 1) {
            return billetPris * (rabatIProcent /100);
        } else if (eventDato > 10){
            return (billetPris - 30) * (rabatIProcent /100);
        }
        return billetPris;
    }

    @Override
    public String toString() {
        return "DørBillet{" +
                "billetPris=" + billetPris +
                ", billettype='" + billettype + '\'' +
                '}';
    }
}
