package BilOgTrailer;

public class Main {
    public static void main(String[] args) {
        Trailer trailer2 = new Trailer(5000);
        Bil bil2 = new Bil(trailer2,1000);

        System.out.println(bil2);
    }
}
