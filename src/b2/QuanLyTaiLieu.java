package b2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
    private List<TaiLieu> taiLieuList;

    public QuanLyTaiLieu() {
        this.taiLieuList = new ArrayList<>();
    }

    public void themTaiLieu(TaiLieu taiLieu){
        taiLieuList.add(taiLieu);
    }

    public void xoaTaiLieuTheoMa(String id){
        taiLieuList.removeIf(item -> item.getId().contains(id));
    }

    public void thongTinTaiLieu(){
        int count = 0;
        for (TaiLieu item : taiLieuList) {
            System.out.println( ++count + ": " + item.toString());
        }
    }

    public void timKiemTheoSach(){
        int count = 0;
        for (TaiLieu item : taiLieuList) {
            if(item instanceof Sach){
                System.out.println(++count + ": " + item.toString());
            }
        }
    }
    public void timKiemTheoBao(){
        for (TaiLieu item : taiLieuList) {
            if(item instanceof Bao){
                System.out.println(item.toString());
            }
        }
    }
    public void timKiemTheoTapChi(){
        for (TaiLieu item : taiLieuList) {
            if(item instanceof TapChi){
                System.out.println(item.toString());
            }
        }
    }
}
