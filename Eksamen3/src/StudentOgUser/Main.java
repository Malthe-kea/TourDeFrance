package StudentOgUser;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("fedFil.txt");
        fw.write("Det her er en stor fed test! Håber det virker, ellers dumber jeg nok en lignende prøveh hehehehehe");
        fw.close();

        Student student = new Student(12,"hans", "hans@hans.dk");
        Student student2 = new Student(241,"Chris", "Chris@hans.dk");
        Student student3 = new Student(12412,"Torben", "Torben@hans.dk");
        Student student4 = new Student(4112,"hansime", "Hansine@hans.dk");

        ArrayList<String> stArr = new ArrayList<>();

        stArr.add(student.toString());
        stArr.add(student2.toString());
        stArr.add(student3.toString());
        stArr.add(student4.toString());

        Collections.sort(stArr);

        System.out.println(stArr);

    }
}
