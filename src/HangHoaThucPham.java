import java.text.SimpleDateFormat;
import java.util.Date;

public class HangHoaThucPham extends HangHoa{
    private Date ngaySX, ngayHH;
    private String nhaCC;

    
    
    public HangHoaThucPham(int maH, int sLTHKK, String tenHH, double donGiaHH, Date ngaySX, Date ngayHH, String nhaCC) {
        super(maH, sLTHKK, tenHH, donGiaHH);
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
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
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        return super.toString() +" \t Ngay Het Han =" + sf.format(ngayHH) + " \t Ngay San Xuat=" + sf.format(ngaySX) + ", Nha Cung Cap=" + nhaCC;
    }

    
    
    
}
