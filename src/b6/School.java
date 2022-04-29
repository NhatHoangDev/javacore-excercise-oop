package b6;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void showInfo(){
        int count = 0;
        for (Student item : students) {
            System.out.println(++count + ": " + item.toString());
        }
    }

    public List<Student> getStudent20YearOldd(){
        List<Student> students1 = new ArrayList<>();
        for (Student item : students) {
            if(item.getAge() == 20) {
                students1.add(item);
            }
        }
        return students1;
    }
    public void getStudent20YearOld(){
        int count = 0;
        for (Student item : students){
            if(item.getAge() == 20){
                System.out.println(++count + " " + item.toString());
            }
        }
    }

    public int countStudent23YearOldInDN(){
        int count = 0;
        for (Student item : students) {
            if(item.getAge() == 23 && item.getHomeTown().equals("DN")){
                ++count;
            }

        }
        return count;
    }

}
