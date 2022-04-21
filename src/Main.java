import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachHangHoa dsHH = new DanhSachHangHoa();
        Scanner sc = new Scanner(System.in);
        try {
            SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
            String s = "20-02-2022";
            String s1 = "26-02-2022";
            String s2 = "28-02-2022";
            Date d = sf.parse(s);
            Date d1 = sf.parse(s1);
            Date d2 = sf.parse(s2);

            HangHoa h1 = new HangHoaThucPham(12, "Nuoc Ngot", 3000, d, d2, "Cocacola");
            HangHoa h2 = new HangHoaDienMay(1, "ti vi", 1_000_000, 12, 90);
            HangHoa h3 = new HangHoaSanhSu(20, "chen dia", 20_000, "Thai", d1);

            dsHH.add(h1);
            dsHH.add(h2);
            dsHH.add(h3);
        } catch (Exception e) {
            
        }
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1.~~~~~~~~~~~~~~~~~~~THEM HANG HOA~~~~~~~~~~~~~~~~~~~");
            System.out.println("2.~~~~~~~~~~~~~~~~~~~XUAT HANG HOA~~~~~~~~~~~~~~~~~~~");
            System.out.println("3.~~~~~~~~~~~~~~~~~TIM KIEM HANG HOA~~~~~~~~~~~~~~~~~");
            System.out.println("4.~~~~~~~~~~~~~~~~~~~~XOA HANG HOA~~~~~~~~~~~~~~~~~~~");
            System.out.println("5.~~~~~~~~~~~~~~~~~SAP XEP HANG HOA~~~~~~~~~~~~~~~~~~");
            System.out.println("6.~~~~~~~~~~~~~~~~~THONG KE HANG HOA~~~~~~~~~~~~~~~~~");
            System.out.println("7.~~~~~~~~~~~~~~~~~KET THUC HANG HOA~~~~~~~~~~~~~~~~~");
            int key1 = sc.nextInt();
            sc.nextLine();
            switch(key1){
                case 1:
                    dsHH.them();
                break;
                case 2:
                    dsHH.hienThiHangHoa();
                break;
                case 3:
                    System.out.println("Nhap Id Muon tim kiem: ");
                    int maHang = sc.nextInt();
                    dsHH.timHangHoa(maHang);
                break;
                case 4:
                    System.out.println("Nhap Id Muon Xoa");
                    int maH = sc.nextInt();
                    dsHH.xoa(maH);
                break;
                case 5:
                    dsHH.sapXepHangHoa();
                break;
                case 6:
                    dsHH.thongKe();
                break;
                case 7: 
                System.out.println("Thoat!!");
                System.exit(0);
            }
        }while(true);
    }    
}
