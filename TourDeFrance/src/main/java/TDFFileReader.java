import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {

        private Scanner scanner;
        List<Cyclist> teamAndMemberList = new ArrayList<>();

        public TDFFileReader(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            scanner = new Scanner(file);
        }

        public List<Cyclist> readFile() {
            String csvFinishedCyclists;
            String[] token;
            String delimiter = ";";
            List<String> finishedTeams = new ArrayList<>();
            List<String> cyclists = new ArrayList<>();



            while (scanner.hasNextLine()) {
                csvFinishedCyclists = scanner.nextLine();
                token = csvFinishedCyclists.split(delimiter);
                List<String> team = Arrays.asList(token[2]);
                String cyclist = token[1];
                cyclists = Arrays.asList(cyclist);
                teamAndMemberList.add(new Cyclist(cyclist, team));
                }

            return teamAndMemberList;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            for(Cyclist cyclist : teamAndMemberList){
                result.append(cyclist.toString()).append("\n");
            }
            return result.toString();

        }
    }

