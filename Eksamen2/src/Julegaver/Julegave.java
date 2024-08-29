package Julegaver;

import java.util.Random;

public class Julegave {
private Random random = new Random();
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public Julegave(){
       this.isSoft = random.nextBoolean();
       this.doesRattle = random.nextBoolean();
       this.isRectangular = random.nextBoolean();
    }

    public boolean couldBeLego(){
        if(isSoft && isRectangular && doesRattle){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return isSoft + " " + isRectangular + " " + doesRattle;
    }
}
