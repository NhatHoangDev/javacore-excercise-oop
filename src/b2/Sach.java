package b2;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;


    public Sach() {
    }

    public Sach(String loai) {
        super("Sach");
    }


    public Sach(String id, String tenNXB, int soBanPhatHanh,  String tenTacGia, int soTrang) {
        super(id, tenNXB, soBanPhatHanh, "Sach");
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", id='" + id + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", loai='" + loai + '\'' +
                "} ";
    }
}
