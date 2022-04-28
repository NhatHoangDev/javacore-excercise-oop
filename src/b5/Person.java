package b5;

public class Person {
    private String name;
    private int age;
    private String passport;
    private int numRent;
    private Room room;

    public Person(String name, int age, String passport, int numRent, Room room) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.numRent = numRent;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getNumRent() {
        return numRent;
    }

    public void setNumRent(int numRent) {
        this.numRent = numRent;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport='" + passport + '\'' +
                ", numRent=" + numRent +
                ", room=" + room +
                '}';
    }
}
