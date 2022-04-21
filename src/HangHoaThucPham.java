import java.util.Date;

public class HangHoaThucPham extends HangHoa{
    private Date ngaySX, ngayHH;
    private String nhaCC;

    
    public HangHoaThucPham(int sLTHKK, String tenHH, double donGiaHH, java.util.Date ngaySX2, java.util.Date ngayHH2, String nhaCC) {
        super(sLTHKK, tenHH, donGiaHH);
        this.ngaySX = ngaySX2;
        this.ngayHH = ngayHH2;
        this.nhaCC = nhaCC;
    }
    public HangHoaThucPham(Date ngaySX, Date ngayHH, String nhaCC) {
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.nhaCC = nhaCC;
    }
    public Date getNgaySX() {
        return ngaySX;
    }
    public void setNgaySX(Date ngaySX) {
        if (ngaySX.before(this.ngayHH)) {
            this.ngaySX = ngaySX;
        } else {
            System.out.println("Ngay San Xuat Phai Truoc Ngay Het Han");
        }
    }
    public Date getNgayHH() {
        return ngayHH;
    }
    public void setNgayHH(Date ngayHH) {
        if (ngayHH.after(this.ngaySX)) {
            this.ngayHH = ngayHH;
        } else {
            System.out.println("Ngay Het Han Phai Sau Ngay San Xuat");
        }
    }
    public String getNhaCC() {
        return nhaCC;
    }
    public void setNhaCC(String nhaCC) {
        if (nhaCC != null && nhaCC != "") {
            this.nhaCC = nhaCC;
        } else {
            System.out.println("Nha Cung Cap Khong Duoc De Trong");
        }
    }
    @Override
    public String toString() {
        return super.toString() +"HangHoaThucPham [ngayHH=" + ngayHH + ", ngaySX=" + ngaySX + ", nhaCC=" + nhaCC + "]";
    }

    
    
    
}
