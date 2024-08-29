public abstract class StudieBillet extends Billet {
    private int billetPris = 150;
    private String billettype = "Studiebillet";
    private int studieKortiD;
    private final int eventDato = 30;
    private int rabatIProcent = 15;

    public StudieBillet(int studieKortiD) {
        this.studieKortiD = studieKortiD;
    }

    @Override
    public int tjekForsalgsRabat() {
        if (eventDato < 10 && eventDato >= 1) {
            return billetPris-60;
        } else if (eventDato > 10){
            return billetPris-60 * (rabatIProcent /100);
        }
        return billetPris;
    }

    @Override
    public String toString() {
        return "StudieBillet{" +
                "billetPris=" + billetPris +
                ", billettype='" + billettype + '\'' +
                ", studieKortiD=" + studieKortiD +
                '}';
    }
}
