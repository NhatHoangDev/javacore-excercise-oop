package b4;

import java.util.ArrayList;
import java.util.List;

public class ManagerFamily {
    List<Family> families;

    public ManagerFamily() {
        this.families = new ArrayList<>();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public void add(Family family){
        this.families.add(family);
    }

    @Override
    public String toString() {
        return "ManagerFamily{" +
                "families=" + families +
                '}';
    }
}
