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
            String s3 = "30-03-2022";
            Date d = sf.parse(s);
            Date d1 = sf.parse(s1);
            Date d2 = sf.parse(s2);
            Date d3 = sf.parse(s3);

            HangHoa h1 = new HangHoaThucPham(1,12, "Nuoc Ngot", 3_000, d, d2, "Cocacola");
            HangHoa h2 = new HangHoaDienMay(2,1, "TV", 1_000_000, 12, 90);
            HangHoa h3 = new HangHoaSanhSu(3,12, "Chen su", 10_000, "thai", d3);
            HangHoa h4 = new HangHoaDienMay(4,3, "Laptop", 30_000, 24 , 120);
            HangHoa h5 = new HangHoaThucPham(5,21, "Trai Cay", 20_000, d1 , d2,"Dua Hau" );
            HangHoa h6 = new HangHoaSanhSu(6,18, "Ly Su", 50_000, "Thai", d1);
            HangHoa h7 = new HangHoaDienMay(7,4, "Dien Thoai", 120_000, 12, 220);
            HangHoa h8 = new HangHoaThucPham(8,6, "Thuc An", 230_000, d, d3,"Trung Ga");
            HangHoa h9 = new HangHoaSanhSu(9,17, "To Su", 290_000, "Thai", d);
            HangHoa h10 = new HangHoaSanhSu(10,10, "Muong Su", 210_000, "Thai", d1);

            dsHH.add(h1);
            dsHH.add(h2);
            dsHH.add(h3);
            dsHH.add(h4);
            dsHH.add(h5);
            dsHH.add(h6);
            dsHH.add(h7);
            dsHH.add(h8);
            dsHH.add(h9);
            dsHH.add(h10);
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
            System.out.print("Hay Nhap Lua Chon Cua Ban: ");
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
                    dsHH.tinhSLHH();
                    dsHH.thongKe();
                break;
                case 7: 
                System.out.println("Thoat!!");
                System.exit(0);
            }
        }while(true);
    }    
}
