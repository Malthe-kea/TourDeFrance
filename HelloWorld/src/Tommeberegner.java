import java.util.Scanner;
public class Tommeberegner {
    public static void main(String[] args) {

        System.out.println("Velkommen til tommeregneren - indtast det ønskede mål i tommer");
        Scanner input = new Scanner(System.in);

        System.out.println("Antal tommer");
        double tommer = input.nextDouble();
        final double tommerICentimeter = 2.54;
        double resultat = (tommer * tommerICentimeter);

        System.out.println("tommer i cm:" + " " + String.format("%.2f", resultat));
        System.out.println("Tak for at bruge Tommeregneren");
        //System.out.printf();
    }

    }