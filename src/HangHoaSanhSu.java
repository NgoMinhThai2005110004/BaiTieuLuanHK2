import java.sql.Date;

import javax.xml.crypto.Data;

public class HangHoaSanhSu {
    private String nhaSX;
    private Date ngayNhapKho;
    public HangHoaSanhSu(){

    }
    public String getNhaSX(){
        return nhaSX;
    }
    public void setNhaSX(String nhaSX){
        this.nhaSX = nhaSX;
    }
    public Date getNgayNhapKho(){
        return ngayNhapKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho){
        if(ngayNhapKho != null){
            this.ngayNhapKho = ngayNhapKho;
        }
        else{
            System.out.println("Ngay Khong Duoc Rong");
        }
    }
    public HangHoaSanhSu(String nhaSX, Date ngayNhapKho){
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
    public HangHoaSanhSu(int sLTonKhoH, String tenH, double donGiaHH, String nhaSX, Date ngayNhapKho){
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }
}
