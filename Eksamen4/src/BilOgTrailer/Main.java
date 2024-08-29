package BilOgTrailer;

public class Main {
    public static void main(String[] args) {
        Bil bil = new Bil(12031);
        Bil bil2 = new Bil(2010);

        System.out.println(bil.totalVægten());
        bil2.setTrailer(2031);
        System.out.println(bil2.totalVægten());
    }
}
