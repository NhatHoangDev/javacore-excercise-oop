package b1;

public class Staff extends Officer{
    private String task;

    public Staff() {
    }

    public Staff(String name, int age, String address, String gender, String task) {
        super(name, age, address, gender);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", task='" + task + '\'' +
                "} ";
    }
}
