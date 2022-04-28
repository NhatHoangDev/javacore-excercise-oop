package b5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true){
            System.out.println("Application Manager Candidate");
            System.out.println("1. To insert new person for rent");
            System.out.println("2. To remove person by passport");
            System.out.println("3. To calculator price by passport");
            System.out.println("4. To show info");
            System.out.println("5. To exit");
            String line = sc.nextLine();
            switch (line){
                case "1": {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Passport: ");
                    String passport = sc.nextLine();
                    System.out.print("NumberRent: ");
                    int numberRent = sc.nextInt();
                    sc.nextLine();
                    Room room;
                    while (true) {
                        System.out.println("Choise a to rent room type A");
                        System.out.println("Choise b to rent room type B");
                        System.out.println("Choise c to rent room type C");
                        String choise = sc.nextLine();
                        switch (choise) {
                            case "a": {
                                room = new RoomA();
                                break;
                            }
                            case "b": {
                                room = new RoomB();
                                break;
                            }
                            case "c": {
                                room = new RoomC();
                                break;
                            }
                            default:
                                System.out.println("Invalid, retype!!!");
                                continue;
                        }
                        break;
                    }
                    Person person = new Person(name, age, passport, numberRent, room);
                    hotel.addPerson(person);
                    break;
                }
                case "2": {
                    System.out.print("Enter passport: ");
                    String passport = sc.nextLine();
                    boolean check = hotel.deleteByPassPort(passport);
                    if(check){
                        System.out.println("Removed!!!");
                    }else {
                        System.out.println("Passport does not exist!!!");
                    }
                    break;
                }
                case "3": {
                    System.out.print("Enter passport: ");
                    String passport = sc.nextLine();
                    try {
                        System.out.println(hotel.checkPerson(passport).toString());
                    }catch (NullPointerException e){
                        System.out.println("Passport does not exist!!!");
                    }
                    System.out.println("Price: " + hotel.calculator(passport));
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
