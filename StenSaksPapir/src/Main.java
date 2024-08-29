import java.util.Scanner;
import java.util.Random;

// Enum for håndtegn
enum HandSign {
    STEN,
    SAKS,
    PAPIR
}

// Abstrakt Spiller-klasse
abstract class Player {
    private String name;
    private int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void incrementPoints() {
        points++;
    }

    // Abstrakt metode til at få spillerens håndtegn
    public abstract HandSign chooseHandSign();
}

// Menneskespiller-klasse
class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public HandSign chooseHandSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg håndtegn (sten, saks, papir): ");
        String choice = scanner.nextLine().toUpperCase();
        return HandSign.valueOf(choice);
    }
}

// Computerspiller-klasse
class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public HandSign chooseHandSign() {
        Random random = new Random();
        return HandSign.values()[random.nextInt(HandSign.values().length)];
    }
}

// Spilklassen
class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("Velkommen til sten, saks, papir!");

        int roundsPlayed = 0;
        int draws = 0;

        while (roundsPlayed < 3) {
            roundsPlayed++;
            System.out.println("\nRunde " + roundsPlayed + ":");

            HandSign handSign1 = player1.chooseHandSign();
            HandSign handSign2 = player2.chooseHandSign();

            System.out.println(player1.getName() + " valgte " + handSign1);
            System.out.println(player2.getName() + " valgte " + handSign2);

            if (handSign1 == handSign2) {
                System.out.println("Uafgjort!");
                draws++;
            } else if ((handSign1 == HandSign.STEN && handSign2 == HandSign.SAKS) ||
                    (handSign1 == HandSign.SAKS && handSign2 == HandSign.PAPIR) ||
                    (handSign1 == HandSign.PAPIR && handSign2 == HandSign.STEN)) {
                System.out.println(player1.getName() + " vinder!");
                player1.incrementPoints();
            } else {
                System.out.println(player2.getName() + " vinder!");
                player2.incrementPoints();
            }
        }

        if (player1.getPoints() > player2.getPoints()) {
            System.out.println("\n" + player1.getName() + " vinder spillet!");
        } else if (player1.getPoints() < player2.getPoints()) {
            System.out.println("\n" + player2.getName() + " vinder spillet!");
        } else {
            System.out.println("\nUafgjort!");
        }
    }
}

// Main-klasse
public class Main {
    public static void main(String[] args) {
        Player humanPlayer = new HumanPlayer("Spiller 1");
        Player computerPlayer = new ComputerPlayer("Computeren");

        Game game = new Game(humanPlayer, computerPlayer);
        game.start();
    }
}
