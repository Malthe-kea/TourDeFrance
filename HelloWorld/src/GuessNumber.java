import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        //int numberToGuess = 6;
        int userGuess = 0;
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        //Tallet vil altid starte fra 0 i en random metode. Man kan derfor tilføje + 1 bagefter, for at starte fra 1.
        // Inde i parantesen er det angivede tal det højeste antal, som den genererer.
        // Man kan også skrive det som random.nextInt(1,10);
        int numberOfTries = 0;

        System.out.println("Gæt et tal mellem 1 og 10");

        while (userGuess != numberToGuess) {

            userGuess = Input.nextInt();

                if (userGuess < numberToGuess) {

                System.out.println("tallet er højere end det!");
            } else if (userGuess > numberToGuess) {

                System.out.println("Tallet er mindre");
            }
        } numberOfTries++;
        System.out.println("Tillykke! tallet var" + " " + numberToGuess + ". Du brugte" + " " + numberOfTries + " " + "forsøg");
        //For at give en besked når en condition er 'true', skal den printes udenfor while-loopet.
    }
}