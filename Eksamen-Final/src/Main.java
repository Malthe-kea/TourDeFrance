import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<Employee> arrEmpl = new ArrayList<>();

        FileWriter fileWriter = new FileWriter("Eksamen");

        Employee employee1 = new Employee("Malthe", 31000);
        Employee employee2 = new Employee("Carsten", 1000);
        Employee employee3 = new Employee("Adners", 323123100);


        arrEmpl.add(employee1);
        arrEmpl.add(employee2);
        arrEmpl.add(employee3);


        System.out.println(arrEmpl);


        System.out.println(employee1.getBenefits());


    }
}
