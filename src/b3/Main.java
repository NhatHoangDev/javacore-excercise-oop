package b3;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true){
            System.out.println("1. Add new");
            System.out.println("2. Show list");
            System.out.println("3. Find by id");
            System.out.println("4. Exit");
            String line = scanner.nextLine();
            switch (line){
                case "1": {
                    System.out.println("Enter a to insert Candidate A");
                    System.out.println("Enter b to insert Candidate B");
                    System.out.println("Enter c to insert Candidate C");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a": {
                            managerCandidate.add(createCandidate(scanner, "a"));
                            break;
                        }
                        case "b": {
                            managerCandidate.add(createCandidate(scanner, "b"));
                            break;
                        }
                        case "c": {
                            managerCandidate.add(createCandidate(scanner, "c"));
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfo();
                    break;
                }
                case "3": {
                    System.out.println("enter id: ");
                    String id = scanner.nextLine();
                    managerCandidate.searchById(id);
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }

        }
    }

    private static Candidate createCandidate(Scanner scanner, String cate) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if(cate.equals("a")){
            return new CandidateA(id, name, address, priority);
        }else if(cate.equals("b")){
            return new CandidateB(id, name, address, priority);
        }else{
            return new CandidateC(id, name, address, priority);
        }
    }
}
