public abstract class Billet {

    private int billetPris = 0;
    private int iD = 0;
    private int eventDate = 0;
    private int ticketBoughtDate = 0;

    public Billet() {
    }
    public int getBilletPris() {
        return billetPris;
    }

    public abstract int tjekForsalgsRabat();

    public abstract String toString();
}

