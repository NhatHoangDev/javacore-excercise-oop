package b2;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String loai) {
        super("Tap Chi");
    }

    public TapChi(String id, String tenNXB, int soBanPhatHanh, int soPhatHanh, String thangPhatHanh) {
        super(id, tenNXB, soBanPhatHanh, "Tap Chi");
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "id='" + id + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", loai='" + loai + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh='" + thangPhatHanh + '\'' +
                "} ";
    }
}
