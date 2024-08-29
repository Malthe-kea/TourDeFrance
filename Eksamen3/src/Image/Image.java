package Image;

public class Image {
    private String fileName;
    private double width;
    private double hight;

    public Image(String fileName, double width, double hight) {
        this.fileName = fileName;
        this.width = width;
        this.hight = hight;
    }

    public boolean isKnownFiletype() {
        return (fileName.endsWith(".jpg") || fileName.endsWith(".gif") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".webp") || fileName.endsWith(".bnp"));
    }

    public boolean isPortrait(){
        return hight < width;
    }
    public boolean isLandscape(){
        return hight > width;
    }
}
