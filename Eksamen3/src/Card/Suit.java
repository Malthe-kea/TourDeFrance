package Card;

public enum Suit {
    CLUBS(1),
    DIAMONDS(2),
    HEARTS(3),
    SPADE(4);

    final private int powerLevel;
    Suit(int powerLevel){
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel(){
        return powerLevel;
    }
}
