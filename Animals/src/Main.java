public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(9);
        Cat cat = new Cat(2);
        System.out.println(dog.dogYears());
        dog.makeSound();
        System.out.println(cat.alder);
        dog.makeSound();
    }
}
