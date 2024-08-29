public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getBenefits(){
        if (salary > 25000 && salary <= 30000){
            return "Har Mobil";
        }
        else if (salary > 30000 && salary <= 40000){
            return "har mobil og parkering";
        } else if (salary > 40000){
            return "medarbejer har mobil, parkering og bonus på 15%" + (salary *1.15);
        }
        return "Forket ln indtastet";
    }
    @Override
    public String toString(){
        return name;
    }



}
