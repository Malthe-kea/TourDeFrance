import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<Cyclist> teamAndMemberList;
    private List<String> cyclists;
    private List<String> teams;

    public Statistics(String filename) throws FileNotFoundException {
        TDFFileReader tdfFileReader = new TDFFileReader(filename);
        teamAndMemberList = tdfFileReader.readFile();
    }

    public Set<String> getTeams() {
        Set<String> teams = new HashSet<>();
        for (Cyclist cyclist : teamAndMemberList) {
            teams.addAll(cyclist.getTeam());
        }
        return teams;
    }


    public ArrayList<String> getTeamMembers(String team) {
        ArrayList<String> teamMembers = new ArrayList<>();
        for (Cyclist cyclist : teamAndMemberList) {
            for (String cyclistTeam : cyclist.getTeam()) {
                if (cyclistTeam.equals(team)) {
                    teamMembers.add(cyclist.getName());
                    break;
                }
            }
        }
        return teamMembers;
    }


    public Map<String, List<String>> getTeamsWithMembers() {
        Set<String> teams = new HashSet<>();
        for (Cyclist cyclist : teamAndMemberList) {
            teams.addAll(cyclist.getTeam());
        }

        Map<String, List<String>> teamsAndMembers = new HashMap<>();
        for (String team : teams) {
            List<String> members = getTeamMembers(team);
            teamsAndMembers.put(team, members);
        }
        return teamsAndMembers;
    }
}

