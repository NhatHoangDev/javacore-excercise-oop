package b11;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyPTGT quanLyPTGT = new QuanLyPTGT();

        while (true){
            System.out.println("----------------------");
            System.out.println("1. Them xe");
            System.out.println("2. Xoa xe theo id");
            System.out.println("3. Tim xe theo hang san xuat");
            System.out.println("4. Tim xe theo mau");
            System.out.println("5. Hien danh sach xe");
            System.out.println("6. Thoat!!!");
            String choose = sc.nextLine();
            switch (choose){
                case "1": {
                    System.out.println("Nhap a de them xe oto");
                    System.out.println("Nhap b de them xe may");
                    System.out.println("Nhap c de them xe tai");
                    String line = sc.nextLine();
                    switch (line){
                        case "a": {
                            System.out.print("id: ");
                            String id = sc.nextLine();
                            System.out.print("hang san xuat: ");
                            String hangSx = sc.nextLine();
                            System.out.print("nam san xuat: ");
                            String namSx = sc.nextLine();
                            System.out.print("gia ban: ");
                            long giaBan = sc.nextLong();
                            sc.nextLine();
                            System.out.print("mau xe: ");
                            String mauXe = sc.nextLine();
                            System.out.print("so cho ngoi: ");
                            int soChoNgoi = sc.nextInt();
                            sc.nextLine();
                            System.out.print("kieu dong co: ");
                            String kieDongCo = sc.nextLine();
                            PhuongTienGiaoThong oto = new XeOto(id, hangSx, namSx, giaBan, mauXe, soChoNgoi, kieDongCo);
                            quanLyPTGT.add(oto);
                            System.out.println(oto.toString());
                            break;
                        }
                        case "b": {
                            System.out.print("id: ");
                            String id = sc.nextLine();
                            System.out.print("hang san xuat: ");
                            String hangSx = sc.nextLine();
                            System.out.print("nam san xuat: ");
                            String namSx = sc.nextLine();
                            System.out.print("gia ban: ");
                            long giaBan = sc.nextLong();
                            sc.nextLine();
                            System.out.print("mau xe: ");
                            String mauXe = sc.nextLine();
                            System.out.print("cong xuat: ");
                            long congXuat = sc.nextLong();
                            sc.nextLine();
                            PhuongTienGiaoThong xeMay = new XeMay(id, hangSx, namSx, giaBan, mauXe, congXuat);
                            quanLyPTGT.add(xeMay);
                            System.out.println(xeMay.toString());
                            break;
                        }
                        case "c": {
                            System.out.print("id: ");
                            String id = sc.nextLine();
                            System.out.print("hang san xuat: ");
                            String hangSx = sc.nextLine();
                            System.out.print("nam san xuat: ");
                            String namSx = sc.nextLine();
                            System.out.print("gia ban: ");
                            long giaBan = sc.nextLong();
                            sc.nextLine();
                            System.out.print("mau xe: ");
                            String mauXe = sc.nextLine();
                            System.out.print("trong tai: ");
                            long trongTai = sc.nextLong();
                            sc.nextLine();
                            PhuongTienGiaoThong xeTai = new XeTai(id, hangSx, namSx, giaBan, mauXe, trongTai);
                            quanLyPTGT.add(xeTai);
                            System.out.println(xeTai.toString());
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap id xe muon xoa: ");
                    String id = sc.nextLine();
                    if(quanLyPTGT.deleteById(id)){
                        System.out.println("da xoa");
                        break;
                    }
                    System.out.println("Id k ton tai");
                    break;
                }
                case "3": {
                    System.out.print("Nhap hang san xuat muon tim: ");
                    String hangSx = sc.nextLine();
                    List<PhuongTienGiaoThong> ptgtList = quanLyPTGT.searchByHangSX(hangSx);
                    if (ptgtList != null){
                        for (PhuongTienGiaoThong item : ptgtList) {
                            System.out.println(item.toString());
                        }
                        break;
                    }
                    System.out.println("Null");
                    break;
                }
                case "4": {
                    System.out.print("Nhap mau xe muon tim: ");
                    String mau = sc.nextLine();
                    List<PhuongTienGiaoThong> ptgtList = quanLyPTGT.searchByMau(mau);
                    if (ptgtList != null){
                        for (PhuongTienGiaoThong item : ptgtList) {
                            System.out.println(item.toString());
                        }
                        break;
                    }
                    System.out.println("Null");
                    break;
                }
                case "5": {
                    quanLyPTGT.showList();
                    break;
                }
                case "6": {
                    return;
                }
                default: {
                    System.out.println("Invalid!!!");
                    break;
                }
            }
        }
    }
}
