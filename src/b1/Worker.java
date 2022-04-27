package b1;

public class Worker extends Officer{
    private int level;

    public Worker() {
    }

    public Worker(String name, int age, String address, String gender, int level) {
        super(name, age, address, gender);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", level=" + level +
                "} "  ;
    }
}
