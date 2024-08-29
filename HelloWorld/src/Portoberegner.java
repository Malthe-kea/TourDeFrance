import java.util.Scanner;

public class Portoberegner {
    public static void main(String[] args) {

        int pris = 0;
        boolean weightSupported = true;

        System.out.println("Hvor meget vejer brevet?");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();

        if (weight <= 0 || weight >= 2001) {
            System.out.println("Vægten understøttes ikke");
            weightSupported = false;
        } else if (weight < 50) {
            pris = 12;
        } else if (weight <= 100) {
            pris = 24;
        } else if (weight <= 250) {
            pris = 48;
        } else if (weight <= 500) {
            pris = 60;
        } else if (weight <= 2000) {
            pris = 75;
        }
        if (weightSupported) {
            System.out.println("Du skal betale " + pris + " DKK");
        }
    }
}