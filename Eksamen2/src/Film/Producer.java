package Film;

public class Producer {
    private String navn;

    public Producer(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Navn: " + navn;
    }
}
