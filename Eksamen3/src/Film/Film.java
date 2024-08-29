package Film;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
        producer = new Producer();
    }

    public Film(String filmtitel){
        this.filmtitel = filmtitel;
        this.udgivelsesår = 2024;
        producer = new Producer();
    }

}
