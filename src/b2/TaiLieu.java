package b2;

public class TaiLieu {
    protected String id;
    protected String tenNXB;
    protected int soBanPhatHanh;
    protected String loai;

    public TaiLieu() {
    }

    public TaiLieu(String loai) {
        this.loai = loai;
    }

    public TaiLieu(String id, String tenNXB, int soBanPhatHanh, String loai) {
        this.id = id;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}
