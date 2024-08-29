package Hogwarts;

import java.io.FileWriter;
import java.util.Comparator;

public class HogwartsStudent implements Comparable<HogwartsStudent>{

    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
    }

    public void setHouse(String houseInput) {
        if (houseInput.toLowerCase().contains("gryffindor") || houseInput.toLowerCase().contains("hufflepuff") || houseInput.toLowerCase().contains("ravenclaw") || houseInput.toLowerCase().contains("slytherin")) {
            this.house = houseInput;
        } else {
            throw new RuntimeException("this is not a valid house");
        }
    }



    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(HogwartsStudent o) {
        return lastName.toLowerCase().compareTo(o.getLastName().toLowerCase());
    }
}
