package Cards;
public class Card {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit){
        this.value = value;
        this.suit = suit;
    }

    public boolean beats(Card c2){
        if(suit.powerLevel < c2.getSuit().powerLevel){
            return false;
        } else if(value == c2.value){
            return false;
        } else {
            return true;
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
}