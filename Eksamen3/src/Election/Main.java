package Election;

public class Main {
    public static void main(String[] args) {
        Election election = new Election(new Candidate("Flemming", "Helvede", 24123));

        System.out.println(election.getCandidatesFromParty("Helvede"));
    }
}
