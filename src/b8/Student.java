package b8;

public class Student {
    private String name;
    private int age;
    private String numClass;

    public Student() {
    }
    public Student(String name, int age, String numClass) {
        this.name = name;
        this.age = age;
        this.numClass = numClass;
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

    public String getNumClass() {
        return numClass;
    }

    public void setNumClass(String numClass) {
        this.numClass = numClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numClass='" + numClass + '\'' +
                '}';
    }
}
