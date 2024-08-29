package Tekst;

public class Main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();

        tekst.tilføj("Hej");
        tekst.tilføj("Med");
        tekst.tilføj("Dig");
        tekst.tilføj("Dig");
        tekst.tilføj("Du");
        tekst.tilføj("Hej");

        System.out.println(tekst.findAntalUnikke());
    }
}
