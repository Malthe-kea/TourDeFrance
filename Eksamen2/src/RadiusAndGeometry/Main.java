package RadiusAndGeometry;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(82.1);
        Circle circle2 = new Circle(4.1);
        Circle circle3 = new Circle(142.2);
        Circle circle4 = new Circle(8);

        Square square = new Square(72);
        Square square2 = new Square(912.4);
        Square square3 = new Square(0.3);
        Square square4 = new Square(25.1);

        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());
        System.out.println(circle4.getArea());

        System.out.println(square.getArea());
        System.out.println(square2.getArea());
        System.out.println(square3.getArea());
        System.out.println(square4.getArea());
    }
}
