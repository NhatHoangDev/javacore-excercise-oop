package b11;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPTGT {
    private List<PhuongTienGiaoThong> phuongTienGiaoThong;

    public QuanLyPTGT() {
        this.phuongTienGiaoThong = new ArrayList<>();
    }

    public void add(PhuongTienGiaoThong phuongTienGiaoThong1){
        phuongTienGiaoThong.add(phuongTienGiaoThong1);
    }

    public boolean deleteById(String id){
        for (PhuongTienGiaoThong item : phuongTienGiaoThong){
            if (item.getId().equals(id)){
                phuongTienGiaoThong.remove(item);
                return true;
            }
        }
       return false;
    }

    public List<PhuongTienGiaoThong> searchByHangSX(String hangSx){
        List<PhuongTienGiaoThong> list = new ArrayList<>();
        for (PhuongTienGiaoThong item : phuongTienGiaoThong) {
            if(item.getHangSX().equals(hangSx)){
                list.add(item);
            }
        }
        if(list.size() == 0){
            return null;
        }
        return list;
    }

    public List<PhuongTienGiaoThong> searchByMau(String mau){
        List<PhuongTienGiaoThong> list = new ArrayList<>() ;
        for (PhuongTienGiaoThong item : phuongTienGiaoThong) {
            if(item.getMauXe().equals(mau)){
                list.add(item);
            }
        }
        if(list.size() == 0){
            return null;
        }
        return list;
    }

    public void showList(){
        for (PhuongTienGiaoThong item : phuongTienGiaoThong) {
            System.out.println(item.toString());
        }
    }

    @Override
    public String toString() {
        return "QuanLyPTGT{" +
                "phuongTienGiaoThong=" + phuongTienGiaoThong +
                '}';
    }
}
