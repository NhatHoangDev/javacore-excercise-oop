package b1;

import java.util.ArrayList;
import java.util.List;

public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }



    public void add(Officer officer){
        officers.add(officer);
    }

    public void searchByName(String name){
        for (Officer item : officers) {
            if(item.getName().contains(name)){
                System.out.println(item.toString());
            }
        }
    }

    public void showList(){
        for (Officer item : officers) {
            System.out.println(item.toString());
        }
    }
}
