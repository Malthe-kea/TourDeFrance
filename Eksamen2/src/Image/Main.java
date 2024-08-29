package Image;

public class Main {
    public static void main(String[] args) {
        Image image = new Image("malthe.jpg",140,120);

        System.out.println(image.isKnownFileType());
        System.out.println(image.isLandscape());
        System.out.println(image.isPortrait());
    }
}
