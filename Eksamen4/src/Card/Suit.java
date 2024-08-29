package Card;

public enum Suit {
    HEARTS(3),
    DIAMONDS(2),
    CLUBS(1),
    SPADES(4);

    final int PowerLevel;

    Suit(int powerLevel){
        this.PowerLevel = powerLevel;
    }
}
