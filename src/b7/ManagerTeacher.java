package b7;

import java.util.ArrayList;
import java.util.List;

public class ManagerTeacher {
    private final List<Teacher> teacherList;

    public ManagerTeacher() {
        this.teacherList = new ArrayList<>();
    }

    public void add(Teacher teacher){
        this.teacherList.add(teacher);
    }

    public Teacher check(String id){
        Teacher teacher;
        for (Teacher item : teacherList) {
            if(item.getId().equals(id)){
                teacher = item;
                return teacher;
            }
        }
        return null;
    }

    public boolean removeById(String id){
        Teacher teacher = check(id);
        if (teacher == null){
            return false;
        }else {
            this.teacherList.remove(teacher);
            return true;
        }
    }

    public double getRealSalary(String id){
        Teacher teacher = check(id);
        if(teacher == null){
            return 0;
        }
        return teacher.getRealSalary();
    }
    public void showList(){
        for (Teacher item : teacherList) {
            System.out.println(item.toString());
        }
    }
}
