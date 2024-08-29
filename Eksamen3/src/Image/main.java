package Image;

public class main {
    public static void main(String[] args) {
        Image image = new Image("Sejtbillede.jpg", 210, 123);

        System.out.println(image.isPortrait());
        System.out.println(image.isLandscape());
        System.out.println(image.isKnownFiletype());
    }
}
