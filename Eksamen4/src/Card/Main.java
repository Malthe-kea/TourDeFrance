package Card;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Suit.HEARTS, 2);
        Card card2 = new Card(Suit.SPADES,10);

        System.out.println(card1.beats(card2));
    }
}
