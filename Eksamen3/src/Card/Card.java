package Card;

public class Card {

    private Suit suit;
    private int value;

    public Card(Suit suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public Boolean beats(Card card){
        if ( suit.getPowerLevel() > card.suit.getPowerLevel()){
            return true;
        } else if (value > card.getValue()){
            return true;
        } else return false;
    }
    
    

    public int getValue() {
        return value;
    }
}
