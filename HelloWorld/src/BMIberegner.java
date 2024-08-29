import java.util.Scanner;
public class BMIberegner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("velkommen til BMI-Enterprise A/S");
        System.out.println("Venligst indtast din højde i meter");

        double hightInCm = input.nextDouble();
        System.out.println("Indtast venligst din vægt i KG");
        double weightInKilo = input.nextDouble();
        double BMI = weightInKilo / (hightInCm * hightInCm);

        if (BMI < 18.5) {
           System.out.println("Din BMI er undervægtig");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Din BMI er normalvægtig");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Din BMI er overvægtig");
        } else {
            System.out.println("Du er smælder-fed, man");
        }
    }
}