package b2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        while(true){
            System.out.println("Quan ly tai lieu");
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Xoa tai lieu theo id");
            System.out.println("3. Hien thi danh sach tai lieu");
            System.out.println("4. Tim kiem theo loai");
            System.out.println("5. Thoat");
            String line = sc.nextLine();
            switch (line){
                case "1": {
                    System.out.println("nhap a de them sach");
                    System.out.println("nhap b de them tap chi");
                    System.out.println("nhap c de them bao");
                    String type = sc.nextLine();
                    switch (type){
                        case "a":{
                            System.out.println("id: ");
                            String id = sc.nextLine();
                            System.out.println("ten nxb: ");
                            String tenNXB = sc.nextLine();
                            System.out.println("so ban phat hanh");
                            int soBanPhatHanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("ten tac gia: ");
                            String tenTacGia = sc.nextLine();
                            System.out.println("so trang: ");
                            int soTrang = sc.nextInt();
                            Sach sach = new Sach(id, tenNXB, soBanPhatHanh, tenTacGia, soTrang);
                            quanLyTaiLieu.themTaiLieu(sach);
                            System.out.println(sach.toString());
                            sc.nextLine();
                            break;
                        }
                        case "b":{
                            System.out.println("id: ");
                            String id = sc.nextLine();
                            System.out.println("ten nxb: ");
                            String tenNXB = sc.nextLine();
                            System.out.println("so ban phat hanh");
                            int soBanPhatHanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("so phat hanh: ");
                            int soPhatHanh = sc.nextInt();
                            System.out.println("thang phat hanh: ");
                            sc.nextLine();
                            String thangPhatHanh = sc.nextLine();
                            TapChi tapChi = new TapChi(id, tenNXB, soBanPhatHanh, soPhatHanh, thangPhatHanh);
                            quanLyTaiLieu.themTaiLieu(tapChi);
                            System.out.println(tapChi.toString());
                            break;
                        }
                        case "c":{
                            System.out.println("id: ");
                            String id = sc.nextLine();
                            System.out.println("ten nxb: ");
                            String tenNXB = sc.nextLine();
                            System.out.println("so ban phat hanh");
                            int soBanPhatHanh = sc.nextInt();
                            sc.nextLine();
                            System.out.println("ngay phat hanh: ");
                            String ngayPhatHanh = sc.nextLine();
                            Bao bao = new Bao(id, tenNXB, soBanPhatHanh, ngayPhatHanh);
                            quanLyTaiLieu.themTaiLieu(bao);
                            System.out.println(bao.toString());
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Nhap id muon xoa: ");
                    String id = sc.nextLine();
                    quanLyTaiLieu.xoaTaiLieuTheoMa(id);
                    break;
                }
                case "3": {
                    System.out.println("Danh sach tai lieu");
                    quanLyTaiLieu.thongTinTaiLieu();
                    break;
                }
                case "4": {
                    System.out.println("Nhap a de tim sach");
                    System.out.println("Nhap b de tim bao");
                    System.out.println("Nhap c de tim tap chi");
                    String type = sc.nextLine();
                    switch (type){
                        case "a": {
                            System.out.println("Danh sach cac loai sach");
                            quanLyTaiLieu.timKiemTheoSach();
                            break;
                        }
                        case "b": {
                            System.out.println("Danh sach cac loai bao");
                            quanLyTaiLieu.timKiemTheoBao();
                            break;
                        }
                        case "c": {
                            System.out.println("Danh sach cac loai tap chi");
                            quanLyTaiLieu.timKiemTheoTapChi();
                            break;
                        }
                        default:
                            break;
                    }
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
