package Hogwarts2;

public class HogwartsStudent implements Comparable<HogwartsStudent>{
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setHouse(String houseToSet) {
        try {
            if (houseToSet.toLowerCase().contains("Gryffindor") || houseToSet.toLowerCase().contains("Hufflepuff") || houseToSet.toLowerCase().contains("Slytherin") ||houseToSet.toLowerCase().contains("Ravenclaw"))
                this.house = houseToSet;
        } catch (Exception e) {
            System.out.println("Forkert House indtastet");
        }
    }
    public void sortStudentsByLastname(){

    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public int compareTo(HogwartsStudent h){
        return lastName.compareTo(h.lastName);
    }


}
