public class Cat extends Animals{

    public Cat(int alder) {
        super(alder);
    }

    @Override
    public void makeSound() {
        System.out.println("moew");
    }
}
