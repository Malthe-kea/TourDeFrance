package Card;

public class Main {
    public static void main(String[] args) {


        Card card = new Card(Suit.DIAMONDS, 2);
        Card card2 = new Card(Suit.CLUBS, 11);

        System.out.println(card.beats(card2));
    }
}
