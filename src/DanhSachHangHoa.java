import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    private List<HangHoa> ds = new ArrayList<>();
    private int sLHHDienMay;
    private int sLHHSanhSu;
    private int sLHHThucPham;
    private String yn;
    public Scanner sc = new Scanner(System.in);
    
    public void them(){
        ControllerHangHoa cl = new ControllerHangHoa();
        String tieptuc = null;
        do{
            HangHoa hh = cl.inputHangHoa();
            this.add(hh);
            System.out.println("Ban Co Muon Tiep Tuc Khong ? Y / N");
            tieptuc = cl.getNhap().nextLine();

        }while (tieptuc.equalsIgnoreCase("Y"));
    }

    void add(HangHoa hh) {
        ds.add(hh);
    }

    public void hienThiHangHoa(){
        for (HangHoa hangHoa : ds){
            System.out.println(hangHoa);
        }
    }

    public void xoa(int id) {
        HangHoa Hoa = null;
        for (HangHoa hangH : ds) {
            if (id == hangH.getMaH()) {
                Hoa = hangH;
                break;
            }
        }
        if (Hoa != null) {
            ds.remove(Hoa);
            System.out.println("Hang Hoa Da Duoc Xoa");
        } else {
            System.out.println("Hang Hoa Khong Ton Tai");
        }
    }

    public HangHoa timHangHoa(int maH){
        HangHoa hangHoa = null;
        for (HangHoa hangHoa1 : ds){
            if (maH == hangHoa1.getMaH()){
                hangHoa = hangHoa1;
                System.out.println(hangHoa1);
                break;
            }
            else{
            System.out.println("Hang hoa khong co");
            break;
            }
            
        }
        return hangHoa;
    }

    

    public void sapXepHangHoa(){
        Collections.sort(ds, new Comparator<HangHoa>() {

            @Override
            public int compare(HangHoa h1, HangHoa h2) {
                if(h1.getDonGiaHH() < h2.getDonGiaHH()){
                    return 1;
                }
                else{
                    if(h1.getDonGiaHH() == h2.getDonGiaHH()){
                        return 0;
                    }
                    else{
                        return -1;
                    }
                }
            }
        });
        this.hienThiHangHoa();
    }

    public void tinhSLHH(){

        for (HangHoa hangHoa : ds) {
            if (hangHoa instanceof HangHoaThucPham){
                this.sLHHThucPham++;
            }
            if (hangHoa instanceof HangHoaDienMay){
                this.sLHHDienMay++;
            }
            if (hangHoa instanceof HangHoaSanhSu){
                this.sLHHSanhSu++;
            }
        }
        
    }

    public void thongKe(){
        System.out.println("so Luong Hang Thuc Pham" + sLHHThucPham);
        System.out.println("so Luong Hang Dien May" + sLHHDienMay);
        System.out.println("so Luong Hang Sanh Su" + sLHHSanhSu);
    }
}
