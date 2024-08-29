import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TDFFileReader test = new TDFFileReader("tdffinishers2024.csv");
        Statistics statestics = new Statistics("tdffinishers2024.csv");

        System.out.println(test.readFile());
        System.out.println(statestics.getTeams());
        System.out.println(statestics.getTeamMembers("LIDL-TREK"));
        System.out.println(statestics.getTeamsWithMembers());
    }
}
