package Film;

public class Film {
    private String filmtitel;
    private int udgivesesår;
    private Producer producer;
    public Film(String filmtitel, int udgivelsesår, Producer producer){
        this.filmtitel = filmtitel;
        this.udgivesesår = udgivelsesår;
        this.producer = producer;
    }

    public Film(String filmtitel){
        this.filmtitel= filmtitel;
        this.udgivesesår = 2024;
        this.producer = new Producer("Not available");
    }

    public String toString(){
        return "Filmtitel: " + filmtitel +
                "\nUdgivelsesår: " + udgivesesår +
                "\nProducer: " + producer.toString();
    }


}
