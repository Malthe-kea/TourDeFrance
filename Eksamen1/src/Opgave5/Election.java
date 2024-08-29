package Opgave5;

import java.util.ArrayList;

public class Election {
    ArrayList<Candidate> listOfCandidates = new ArrayList<>();

    public Election(){
    }

    public Integer getTotalVores(){
        int totalNumberOfVotes = 0;
        for (Candidate c : listOfCandidates){
            totalNumberOfVotes += c.getNumberOfVotes();
        }
        return totalNumberOfVotes;
    }

}
