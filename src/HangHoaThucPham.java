import java.sql.Date;

public class HangHoaThucPham {
    private Date ngaySX, ngayHH;
    private String nhaCC;
    public HangHoaThucPham(){

    }
    public Date getNgaySX(){
        return ngaySX;
    }

    private void setNgaySX(Date ngaySX){
        if(ngaySX.before(this.ngaySX)){
            this.ngaySX = ngaySX;
        }
        else{
            System.out.println("Ngay San Xuat Phai Truoc Ngay Het Han");
        }
    }
    public Date getNgayHH(){
        return ngayHH;
    }

    private void setNgayHH(Date ngayHH){
        if(ngayHH.after(this.ngaySX)){
            this.ngayHH = ngayHH;
        }
        else{
            System.out.println("Ngay Het Han Phai Sau Ngay San Xuat");
        }
    }
    public String getNhaCC(){
        return nhaCC;
    }
    private void setNhaCC(String nhaCC){
        if(nhaCC != null && nhaCC != ""){
            this.nhaCC = nhaCC;
        }
        else{
            System.out.println("Nha Cung Cap Khong Duoc Rong");
        }
    }
    public HangHoaThucPham(Date ngaySX, Date ngayHH, String nhaCC){
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.nhaCC = nhaCC;
    }
    public HangHoaThucPham(int sLTonKhoH, String tenH, double donGiaHH, Date ngayHH, String nhaCC){
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
        this.nhaCC = nhaCC;
    }
}
