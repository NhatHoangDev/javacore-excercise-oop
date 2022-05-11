package b11;

public class XeMay extends PhuongTienGiaoThong{
    private long congXuat;

    public XeMay(String id, String hangSX, String namSX, long giaBan, String mauXe, long congXuat) {
        super(id, hangSX, namSX, giaBan, mauXe);
        this.congXuat = congXuat;
    }

    public long getCongXuat() {
        return congXuat;
    }

    public void setCongXuat(long congXuat) {
        this.congXuat = congXuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                ", congXuat=" + congXuat +
                '}';
    }
}
