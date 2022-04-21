import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    private List<HangHoa> lHoas = new ArrayList<>();
    private int sLHHDienMay;
    private int sLHHSanhSu;
    private int sLHHThucPham;
    private String yn;
    private Scanner sc = new Scanner(System.in);
    public DanhSachHangHoa(){

    }
    public DanhSachHangHoa(int sLHHDienMay, int sLHHSanhSu, int sLHHThucPham){
        this.sLHHDienMay = sLHHDienMay;
        this.sLHHSanhSu = sLHHSanhSu;
        this.sLHHThucPham = sLHHThucPham;
    }
    
    public int getsLHHDienMay(){
        return sLHHDienMay;
    }

    public void setsLHHDienMay(int sLHHDienMay){
        this.sLHHDienMay = sLHHDienMay;
    }

    public void suaHangHoa(){

    }

    public void thongKeHangHoa(){

    }
    
    public void baoCaoHangHoa(){

    }

    public void sapXepHangHoa(){

    }

    public void themHangHoa(HangHoa hangHoa){
        lHoas.add(hangHoa);
    }
    public void themHangHoas(HangHoa hangHoa){
        System.out.println("Nhap Tiep Khong [Y or N]");
        yn = sc.nextLine();
        while(yn.equals("Y") || yn.equals("y")){
            this.themHangHoa(hangHoa);
        }
    }
    public void hienThiHangHoa(){
        for (HangHoa hangHoa : lHoas){
            System.out.println(hangHoa);
        }
    }
}
