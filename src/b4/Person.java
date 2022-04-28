package b4;

public class Person {
    private String name;
    private int age;
    private String job;
    private String CMND;

    public Person() {
    }

    public Person(String name, int age, String job, String CMND) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.CMND = CMND;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public String toString() {
        return "\n" + "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", CMND='" + CMND + '\'' +
                '}';
    }
}
