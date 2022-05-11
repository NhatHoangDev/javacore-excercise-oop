package b11;

public class XeOto extends PhuongTienGiaoThong{
    private int soChoNgoi;
    private String kieuDongCo;

    public XeOto(String id, String hangSX, String namSX, long giaBan, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public String toString() {
        return "XeOto{" +
                "id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                ", soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }
}
