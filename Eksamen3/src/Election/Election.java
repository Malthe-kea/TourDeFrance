package Election;

import java.util.ArrayList;

public class Election {

    ArrayList<Candidate> candArr= new ArrayList<>();

    public Election(Candidate candidate){
        candArr.add(candidate);
    }

    public int getTotalVotes(){
        int totaltNumberOfVotes = 0;

        for (Candidate c : candArr)
            totaltNumberOfVotes += c.getNumberOfVotes();
        return totaltNumberOfVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String partyToSearchFor){
        ArrayList<Candidate> tempCandArr = new ArrayList();
        for (Candidate c : candArr)
            if (c.getParty().equals(partyToSearchFor))
                tempCandArr.add(c);

        return tempCandArr;
    }

}
