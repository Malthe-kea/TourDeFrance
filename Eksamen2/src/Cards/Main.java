package Cards;

public class Main {
    public static void main(String[] args) {
            Card card1 = new Card(9000,Suit.HEARTS);
            Card card2 = new Card(8, Suit.DIAMONDS);

        System.out.println(card1.beats(card2));
    }
}
