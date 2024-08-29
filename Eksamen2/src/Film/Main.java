package Film;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Henning Stærk");
        Film film1 = new Film("Die Hard");
        Film film2 = new Film("Die Hard 2", 213, producer);

        System.out.println(film2.toString());
        System.out.println(film1);

    }
}
