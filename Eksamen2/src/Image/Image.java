package Image;

import java.util.ArrayList;
import java.util.Arrays;

public class Image {
    private String fileName;
    private double width;
    private double height;

    public Image(String fileName, double width, double height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType() {
        return fileName.contains(".gif") || fileName.contains(".jpg")|| fileName.contains(".jpeg") || fileName.contains(".png") || fileName.contains("webp")  || fileName.contains("bmp");
    }

    public boolean isPortrait(){
        return height > width;
    }
    public boolean isLandscape(){
        return height < width;
    }
}
