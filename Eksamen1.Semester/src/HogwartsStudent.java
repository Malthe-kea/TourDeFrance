import java.util.Comparator;

public class HogwartsStudent {


    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHouse(String house) {
        try {
            if (
                    house.toLowerCase().equals("gryffindor") || house.toLowerCase().equals("hufflepuff") || house.toLowerCase().equals("slytherin") || house.toLowerCase().equals("ravenclaw")) {
                ;
                this.house = house;
                throw new RuntimeException("The house has been added");
            }
        } catch (Exception e ){
            System.out.println("house not accecpted");
        }
    }

    public String getLastName() {
        return lastName;
    }


    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.house;
    }


}

