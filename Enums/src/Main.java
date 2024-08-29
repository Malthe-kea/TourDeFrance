import java.time.Month;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("""
                Select at month:
                Press 1 - Januar
                Press 2 - Februar
                Press 3 - Marts
                Press 4 - April
                Press 5 - Maj
                Press 6 - Juni
                Press 7 - Juli
                Press 8 - August
                Press 9 - Septemeber 
                Press 10 - Oktober
                Press 11 - November
                Press 12 - December
                """);
        Months månednavn = null;


        Boolean running = true;

        while (running) {
            Scanner userInput = new Scanner(System.in);
            int choice = userInput.nextInt();

            switch (choice) {
                case 1 -> {
                    månednavn = Months.JANUAR;
                }
                case 2 -> {
                    månednavn = Months.FEBRUAR;
                }
                case 3 -> {
                    månednavn = Months.MARTS;
                }
                case 4 -> {
                    månednavn = Months.APRIL;
                }
                case 5 -> {
                    månednavn = Months.MAJ;
                }
                case 6 -> {
                    månednavn = Months.JUNI;
                }
                case 7 -> {
                    månednavn = Months.JULI;
                }
                case 8 -> {
                    månednavn = Months.AUGUST;
                }
                case 9 -> {
                    månednavn = Months.SEPTEMBER;
                }
                case 10 -> {
                    månednavn = Months.OKTOBER;
                }
                case 11 -> {
                    månednavn = Months.NOVEMBER;
                }
                case 12 -> {
                    månednavn = Months.DECEMBER;
                }

                default -> System.out.println("Invalid input");

            }
            switch (månednavn) {
                case DECEMBER, JANUAR, FEBRUAR -> {
                    System.out.println("Vinter");
                }
                case MARTS, APRIL, MAJ -> {
                    System.out.println("Forår");
                }
                case JUNI, JULI, AUGUST -> {
                    System.out.println("Sommer");
                }
                case SEPTEMBER, OKTOBER, NOVEMBER -> {
                    System.out.println("Efterår");
                }
                default -> {
                    System.out.println("fejl input");
                }
            }
        }
    }
}
