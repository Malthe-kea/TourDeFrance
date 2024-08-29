package BilOgTrailer;

public class Bil {
    private Trailer trailer;
    private int vægt;
    private String model;

    public Bil(int vægt, int trailerVægt, String model) {
        this.model = model;
        this.vægt = vægt;
        if (vægt <= 3500) {
            trailer = new Trailer(trailerVægt);
        }
    }

    public int totalVægt(){
        return vægt + trailer.getVægt();
    }

    @Override
    public String toString() {
        return "den samlede vægt er " + totalVægt();
    }
    public int getVægt(){
        return vægt;
    }
    public String getModel(){
        return model;
    }
}
