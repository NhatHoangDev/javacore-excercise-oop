package b11;

public class XeTai extends PhuongTienGiaoThong {
    private long trongTai;

    public XeTai(String id, String hangSX, String namSX, long giaBan, String mauXe, long trongTai) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.trongTai = trongTai;
    }

    public long getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(long trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                ", trongTai=" + trongTai +
                '}';
    }
}
