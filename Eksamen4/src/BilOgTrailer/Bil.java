package BilOgTrailer;

public class Bil {
    private Trailer trailer;
    private int vægt;

    public Bil(int vægt) {
        this.vægt = vægt;
    }

    public Bil(int vægt, int trailervægt) {
        this.trailer = new Trailer(trailervægt);
        this.vægt = vægt;
    }

    public int totalVægten() {
        if(trailer == null){
            return vægt;
        }
        return vægt + trailer.getVægt();
    }
    public void setTrailer(int vægt){
        this.trailer = new Trailer(vægt);
    }
}
