package b7;

public class Teacher {
    private String name;
    private int age;
    private String homeTown;
    private String id;
    private double salary;
    private double bonus;
    private double penaty;
    private double realSalary;

    public Teacher() {
    }

    public Teacher(String name, int age, String homeTown, String id, double salary, double bonus, double penaty) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.realSalary = salary + bonus - penaty;
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

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", penaty=" + penaty +
                ", realSalary=" + realSalary +
                '}';
    }
}
