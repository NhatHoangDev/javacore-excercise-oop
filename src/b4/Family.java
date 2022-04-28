package b4;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private String address;
    private int numberOfMember;
    private List<Person> personList;

    public Family() {
        this.personList = new ArrayList<>();
    }

    public Family(String address, int numberOfMember, List<Person> personList) {
        this.address = address;
        this.personList = personList;
        this.numberOfMember = numberOfMember;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    @Override
    public String toString() {
        return "Family{" +
                "address='" + address + '\'' +
                ", numberOfMember=" + numberOfMember +
                ", personList=" + personList.toString() +
                '}' ;
    }
}
