package Opgave3;

public class SportsResult {
    private String team1;
    private String team2;
    private String result;

    // Constructor
    public SportsResult(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    // Getters and Setters
    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    // Method to generate a random result
    public void generateRandomResult() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                this.result = "Team 1 wins";
                break;
            case 1:
                this.result = "Team 2 wins";
                break;
            case 2:
                this.result = "Draw";
                break;
        }
    }

    @Override
    public String toString() {
        return team1 + " vs " + team2 + ": " + result;
    }
}