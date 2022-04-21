public class HangHoa {
    private int maH, sLTonKhoH;
    private String tenHH;
    private double donGiaHH;

    public int getMaHang(){
        return maH;
    }

    public void setMaHang(int maHang){
        if(maHang > 0){
            this.maH = maHang;
        }else{
            System.out.println("Ma hang khong duoc de trong");
        }
    }

    public String getTenHang(){
        return tenHH;
    }

    public HangHoa(int sLTonKhoH, String tenHH, double donGiaHH) {
        this.maH = maH;
        this.sLTonKhoH = sLTonKhoH;
        this.tenHH = tenHH;
        this.donGiaHH = donGiaHH;
    }

    public HangHoa() {
    }
    
    
    
    
    
}
