package Media;

public class Audio extends Media{

    private String loudness;

    public Audio(String name, double duration, String loudness) throws Exception{
        super(name, duration);
        this.loudness = loudness;
    }

    @Override
    public String toString(){
        return "loudness: " + loudness;
    }


}
