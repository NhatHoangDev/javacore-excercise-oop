package b3;

import java.util.ArrayList;
import java.util.List;

public class ManagerCandidate {
    private List<Candidate> candidates;

    public ManagerCandidate(){
        this.candidates = new ArrayList<>();
    }

    public void add(Candidate candidate){
        candidates.add(candidate);
    }

    public void showInfo(){
        int count = 0;
        for (Candidate item : candidates) {
            System.out.println(++count + ": " + item.toString());
        }
    }

    public void searchById(String id){
        Candidate candidate = null;
        for (Candidate item : candidates) {
            if(item.getId().contains(id)){
                System.out.println(item.toString());
            }
        }
    }
}
