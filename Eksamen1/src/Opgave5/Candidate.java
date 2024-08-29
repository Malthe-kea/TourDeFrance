package Opgave5;

import java.util.ArrayList;
import java.util.List;

public class Candidate {
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getParty() {
        return party;
    }

    public List<Candidate> getCandidatesFromParty(String party, Candidate candidate) {
        ArrayList<Candidate> tempListOfCandidates = new ArrayList<>();
        tempListOfCandidates.add(candidate);
        for (Candidate c : tempListOfCandidates)
            if (c.getParty().contains(party)) {
                tempListOfCandidates.add(c);
            }
        return tempListOfCandidates;
    }
}
