package Cards;

public enum Suit {

    HEARTS(1),
    CLUBS(2),
    SPADES(3),
    DIAMONDS(4);

    final int powerLevel;

    Suit(int powerlevel){
        this.powerLevel = powerlevel;
    }

}
