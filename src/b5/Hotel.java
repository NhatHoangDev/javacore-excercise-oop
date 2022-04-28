package b5;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> personList;

    public Hotel() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person){
        this.personList.add(person);
    }

    public Person checkPerson(String passport){
        Person person = null;
        for (Person item : personList) {
            if(item.getPassport().equals(passport)){
                return item;
            }
        }
        return person;
    }

    public boolean deleteByPassPort(String passport){
        Person person = checkPerson(passport);
        if (person == null){
            return false;
        }
        this.personList.remove(person);
        return true;
    }

    public int calculator(String passport){
        Person person = checkPerson(passport);
        if(person == null){
            return 0;
        }else{
             return person.getNumRent() * person.getRoom().getPrice();
        }
    }

    public void show(){
        int count = 0;
        for (Person item : personList) {
            System.out.println(++count + ": " + item.toString());
        }
    }
}
