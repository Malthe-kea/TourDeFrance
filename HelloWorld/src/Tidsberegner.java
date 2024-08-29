import java.util.Scanner;
public class Tidsberegner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hvad er klokken i timer?");
        int timer = input.nextInt();
        System.out.println("Hvad er klokken i minutter?");
        int minutter = input.nextInt();
        System.out.println("Hvad er klokken i sekunder?");
        int sekunder = input.nextInt();

        int sekunderIAltSidenMidnat = (timer * 60 * 60) + (minutter * 60) + (sekunder);

        System.out.println("klokken er" + " " + sekunderIAltSidenMidnat + " " + "i sekunder");



    }
}
