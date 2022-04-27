package b2;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {
    }

    public Bao(String loai) {
        super("Bao");
    }

    public Bao(String id, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(id, tenNXB, soBanPhatHanh, "Bao");
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                ", id='" + id + '\'' +
                ", tenNXB='" + tenNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", loai='" + loai + '\'' +
                "} ";
    }
}
