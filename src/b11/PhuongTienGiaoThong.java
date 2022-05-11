package b11;

public class PhuongTienGiaoThong {
    protected String id;
    protected String hangSX;
    protected String namSX;
    protected long giaBan;
    protected String mauXe;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String id, String hangSX, String namSX, long giaBan, String mauXe) {
        this.id = id;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }
}
