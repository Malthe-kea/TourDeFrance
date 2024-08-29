import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<HogwartsStudent> hogwartsStudentsArr = new ArrayList<>();

        HogwartsStudent hogwartsStudent = new HogwartsStudent("Malthe", "tifukær");
        HogwartsStudent hogwartsStudent3 = new HogwartsStudent("Henning", "stærk");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Harry", "Potter");
        hogwartsStudentsArr.add(hogwartsStudent);
        hogwartsStudentsArr.add(hogwartsStudent2);
        hogwartsStudentsArr.add(hogwartsStudent3);

        hogwartsStudent.setHouse("Gryffindor");
        hogwartsStudent2.setHouse("Slytherin");
        hogwartsStudent3.setHouse("Uffe");

        Collections.sort(hogwartsStudentsArr, new SortByName());

        for (int i = 0; i < hogwartsStudentsArr.size(); i++) {
            System.out.println(hogwartsStudentsArr.get(i));

        }
    }
}
