package Candidate;

import java.util.ArrayList;
import java.util.Arrays;

public class Election {

    private ArrayList<Candidate> candidatesArr;

    public Election(){
        candidatesArr = new ArrayList<>();
    }

    public int getTotalVotes( ){
        int totalVotes = 0;
        for (Candidate c : candidatesArr){
           // c.getNumberOfVotes() += totalVotes;
        }
        return totalVotes;
    }
}
