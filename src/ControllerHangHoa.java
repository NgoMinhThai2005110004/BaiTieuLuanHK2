import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerHangHoa {
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private List<HangHoa> ds = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);

    public Scanner getNhap(){
        return sc;
    }

    
    public HangHoa inputHangHoa(){
        HangHoa hanghoa = null;
        int id = (ds.size() > 0) ? (ds.size() +1) : 1;
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Ten Hang Hoa: ");
        String tenHH = sc.nextLine();
        System.out.println("Nhap Don Gia Hang Hoa:");
        double donGiaHH = sc.nextDouble();
        System.out.println("Nhap So Luong Ton Kho:");
        int sLTHKK = sc.nextInt();
        System.out.println("1> Thuc Pham, 2> Dien May, 3>Sanh su");
        int key = sc.nextInt();
        sc.nextLine();
        switch (key) {
            case 1:
                System.out.println("Nhap Du Lieu Cho Dien May");
                System.out.println("Nhap Thoi Gian Bao Hanh");
                int thoiGianBH = sc.nextInt();
                System.out.println("Nhap Cong Suat");
                Double congSuat = sc.nextDouble();
                hanghoa = new HangHoaDienMay(sLTHKK, tenHH, donGiaHH, thoiGianBH, congSuat);
                break;
            case 2:
                System.out.println("Chon Chuc Nang Cho Thuc Pham");
                try {
                    System.out.println("Nhap Ngay San Xuat");
                    Date ngaySX = df.parse(sc.nextLine());
                    System.out.println("Nhap Ngay Het Han");
                    Date ngayHH = df.parse(sc.nextLine());
                    System.out.println("Nhap Nha Cung Cap");
                    String nhaCC = sc.nextLine();
                    hanghoa = new HangHoaThucPham(sLTHKK, tenHH, donGiaHH, ngaySX, ngayHH, nhaCC);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                System.out.println("Nhap Hang Sanh Su");
                try {
                    System.out.println("Nhap Ngay Nhap Kho");
                    Date ngayNhapKho = df.parse(sc.nextLine());
                    System.out.println("Nhap Nha San Suat");
                    String nhaSX = sc.nextLine();
                    hanghoa = new HangHoaSanhSu(sLTHKK, tenHH, donGiaHH, nhaSX, ngayNhapKho);
                } catch (ParseException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Lua Chon Cua Ban Khong Dung");
        }

        ds.add(hanghoa);
        return hanghoa;
    }

}
