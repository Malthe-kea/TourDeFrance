package BilOgTrailer;

public class Bil {

    private Trailer trailer;
    private int vægt;

    public Bil(int vægt){
       this.vægt = vægt;
    }
    public Bil (Trailer trailer, int vægt){
        this.vægt = vægt;
        this.trailer = trailer;
        if (totalVægt() >= 3500){
            System.out.println("Trailer kan ikke tilføjes til bil");
        }

    }

    public int totalVægt(){
        if(trailer != null){
        return trailer.getVægt()+ vægt;
    }else
        return vægt;
    }

    @Override
    public String toString() {
        return  "vægt: " + vægt;
    }
}
