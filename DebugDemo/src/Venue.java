

public class Venue {
    private String name;
    private int capacity;
    private int ticketPrice;
    private String city;
    private boolean isInJylland;

    public Venue(String name, int capacity, int ticketPrice, String city, boolean isInJylland) {
        this.name = name;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.city = city;
        this.isInJylland = isInJylland;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public boolean isInJylland() {
        return isInJylland;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        return "Navn: |" + name +
                "| \nKapacitet: " + capacity +
                ", Billetpris: " + ticketPrice +
                ", By: " + city + '\n';
    }
}
