package b8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerCard managerCard = new ManagerCard();
        while (true){
            System.out.println("Application");
            System.out.println("1. Add new card");
            System.out.println("2. Delete card by id");
            System.out.println("3. Show list card");
            System.out.println("4. Exit");
            String choice = sc.nextLine();
            switch (choice){
                case "1": {
                    System.out.print("Student name: ");
                    String stuName = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Class: ");
                    String numClass = sc.nextLine();
                    Student student = new Student(stuName, age, numClass);
                    System.out.print("Id card: ");
                    String id = sc.nextLine();
                    System.out.print("Book id: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("BorrowDate: ");
                    int borrowDate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Payment Date: ");
                    int paymentDate = sc.nextInt();
                    sc.nextLine();
                    Card card = new Card(student, id, bookId, borrowDate, paymentDate);
                    managerCard.add(card);
                    System.out.println(card.toString());
                    break;
                }
                case "2": {
                    System.out.print("Enter id want to delete: ");
                    String id = sc.nextLine();
                    boolean delete = managerCard.deleteById(id);
                    if (delete){
                        System.out.println("Deleted");
                    }else{
                        System.out.println("Delete fail");
                    }
                    break;
                }
                case "3": {
                    managerCard.showList();
                    break;
                }
                case "4": {
                    return;
                }
                default: {
                    System.out.println("Invalid");
                    break;
                }
            }
        }
    }
}
