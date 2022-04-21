public class HangHoaDienMay extends HangHoa  {
    private int thoiGianBH;
    private double congXuat;
    public HangHoaDienMay(){

    }
    public int getThoiGianBH(){
        return thoiGianBH;
    }
    private void setThoiGianBH(int thoiGianBH){
        if(thoiGianBH > 0){
            this.thoiGianBH = thoiGianBH;
        }
        else{
            System.out.println("Thoi Gian Bao Hanh Khong Hop Le");
        }
    }
    public double getCongXuat(){
        return congXuat;
    }
    private void setCongXuat(double congXuat){
        if(congXuat > 0){
            this.congXuat = congXuat;
        }
        else{
            System.out.println("Cong Xuat Khong Hop Le");
        }
    }
    public HangHoaDienMay( int sLTonKhoH, String tenHH, double donGiaHH, int thoiGianBH, double congXuat) {
        super( sLTonKhoH, tenHH, donGiaHH);
        this.thoiGianBH = thoiGianBH;
        this.congXuat = congXuat;
    }
    public HangHoaDienMay(int thoiGianBH, double congXuat) {
        this.thoiGianBH = thoiGianBH;
        this.congXuat = congXuat;
    }
    
    
    @Override
    public String toString() {
        return "HangHoaDienMay [congXuat=" + congXuat + ", thoiGianBH=" + thoiGianBH + "]";
    }
    
}

