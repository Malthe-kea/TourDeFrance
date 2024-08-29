import java.util.Random;

public class Terningekast {
    public static void main(String[] args) {

        Random random = new Random();
        int sum = 0;
        int numberOftries = 0;

        while (!(sum == 7)) {
            int terning1 = random.nextInt(6) + 1;
            int terning2 = random.nextInt(6) + 1;
            sum = terning1 + terning2;
            System.out.println(terning1+ "+"+ terning2 + "=" + sum);
            numberOftries++;
        }
        System.out.println("Du brugte " + numberOftries  + " førsøg");
    }
}
