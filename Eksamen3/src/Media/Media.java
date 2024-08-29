package Media;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Media {


    private String name;
    private double duration;

    public Media(String name, double duration) throws IOException {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
