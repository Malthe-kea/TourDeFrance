package Opgave3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriter {

    public static void save(List<SportsResult> results, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.append("Team 1,Team 2,Result\n");
            for (SportsResult result : results) {
                writer.append(result.getTeam1()).append(",");
                writer.append(result.getTeam2()).append(",");
                writer.append(result.getResult()).append("\n");
            }
            System.out.println("Results saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}