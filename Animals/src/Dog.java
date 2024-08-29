public class Dog extends Animals {

    public Dog(int alder) {
        super(alder);
    }

    public int dogYears() {
        return (alder * 7);
    }

    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}

