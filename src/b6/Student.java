package b6;

public class Student {
    private String name;
    private int age;
    private String homeTown;
    private int classStudent;

    public Student() {
    }

    public Student(String name, int age, String homeTown, int classStudent) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.classStudent = classStudent;
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

    public int getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(int classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", homeTown='" + homeTown + '\'' +
                ", classStudent=" + classStudent +
                '}';
    }
}
