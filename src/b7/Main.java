package b7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerTeacher managerTeacher = new ManagerTeacher();
        while (true){
            System.out.println("-----------Application---------");
            System.out.println("1. Add new teacher");
            System.out.println("2. Delete teacher by id");
            System.out.println("3. Get salary by id");
            System.out.println("4. Exit");
            String choise = sc.nextLine();
            switch (choise){
                case "1": {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Home town: ");
                    String homeTown = sc.nextLine();
                    System.out.print("Id: ");
                    String id = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Bonus: ");
                    double bonus = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Penaty: ");
                    double penaty = sc.nextDouble();
                    sc.nextLine();
                    Teacher teacher = new Teacher(name, age, homeTown, id, salary, bonus, penaty);
                    managerTeacher.add(teacher);
                    System.out.println(teacher.toString());
                    break;
                }
                case "2": {
                    System.out.print("Enter id want to remove: ");
                    String id = sc.nextLine();
                    boolean removed = managerTeacher.removeById(id);
                    if(removed){
                        System.out.println("Removed!!!");
                    }else{
                        System.out.println("Id is not exist");
                    }
                    break;
                }
                case "3": {
                    System.out.print("Enter id want to get real salary: ");
                    String id = sc.nextLine();
                    double realSalary = managerTeacher.getRealSalary(id);
                    System.out.println("real salary: " + realSalary);
                    break;
                }
                case "4": {
                    return;
                }
                case "5": {
                    managerTeacher.showList();
                    break;
                }
                default:{
                    System.out.println("Invalid, retype");
                    break;
                }
            }
        }
    }
}
