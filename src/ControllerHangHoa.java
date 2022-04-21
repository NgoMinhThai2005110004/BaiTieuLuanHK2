import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ControllerHangHoa {
    public Scanner sc = new Scanner(System.in);
    private DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();
    private String yn = null, nhaCC;
    private Date ngaySX , ngayHH, ngayNK;
    private SimpleDateFormat sFormat = new SimpleDateFormat("dd/mm/yyyy");
    //Hang nhap cho Hang Hoa
    public HangHoa inputHangHoa(){
        HangHoa hanghoa = null;
        System.out.println("Nhap Ten Hang Hoa: ");
        String tenHH = sc.nextLine();
        System.out.println("Nhap Don Gia Hang Hoa:");
        double donGiaHH = sc.nextDouble();
        System.out.println("Nhap So Luong Ton Kho:");
        int sLTHKK = sc.nextInt();
            
            System.out.print("Ban Dang Chon Nhap Cho Dien May");
            System.out.print("Nhap Thoi Gian Bao Hang Cho Hang Hoa Tren:");
            int thoiGianBH = sc.nextInt();
            System.out.println("Nhap Cong Xuat Cho Hang Hoa Tren:");
            double congXuat = sc.nextDouble();
            hanghoa = new HangHoaDienMay(sLTHKK, tenHH, donGiaHH, thoiGianBH, congXuat);
        return hanghoa;
    }

}
