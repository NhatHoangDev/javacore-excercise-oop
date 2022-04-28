package b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerFamily managerFamily = new ManagerFamily();
        System.out.print("Nhap so ho dan: ");
        int n = sc.nextInt();
        int x = 1;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ho dan " + (i + 1));
            System.out.print("address: ");
            String address = sc.nextLine();
            System.out.print("So thanh vien: ");
            int numberOfMember = sc.nextInt();
            sc.nextLine();
            List<Person> personList = new ArrayList<>();
            int count = 0;
            while (count < numberOfMember) {
                System.out.printf("Thong tin thanh vien %d\n", ++count);
                System.out.print("ten: ");
                String name = sc.nextLine();
                if (name == null | name.equals("")) {
                    break;
                }
                System.out.print("tuoi: ");
                int tuoi = sc.nextInt();
                sc.nextLine();
                System.out.print("nghe nghiep: ");
                String job = sc.nextLine();
                System.out.print("cmnd: ");
                String cmnd = sc.nextLine();
                Person person = new Person(name, tuoi, job, cmnd);
                personList.add(person);

            }
            Family family = new Family(address, numberOfMember, personList);
            managerFamily.add(family);
        }
        for (Family item : managerFamily.families) {

            System.out.println(x + ": " + item.toString());
            ++x;
        }

    }
}
