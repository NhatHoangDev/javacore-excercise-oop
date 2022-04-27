package b1;

public class Engineer extends Officer{
    private String branch;

    public Engineer() {
    }

    public Engineer(String name, int age, String address, String gender, String branch) {
        super(name, age, address, gender);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                "} ";
    }
}
