public abstract class Animals {
    protected int alder;


    public Animals(int alder) {
        this.alder = alder;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
    public abstract void makeSound();
}

