import java.util.List;

public class Cyclist {
    private List<String> team;
    private String name;

    public Cyclist(String name, List<String> team) {
        this.name = name;
        this.team = team;
    }
    public List<String> getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "name: " + name +
                " team: " + team;
    }
}
