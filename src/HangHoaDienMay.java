public class HangHoaDienMay extends HangHoa  {
    private int thoiGianBH;
    private double congSuat;
   
    public HangHoaDienMay(int maH, int sLTHKK, String tenHH, double donGiaHH, int thoiGianBH, double congSuat) {
        super(maH, sLTHKK, tenHH, donGiaHH);
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }
    public HangHoaDienMay(int thoiGianBH, double congSuat) {
        this.thoiGianBH = thoiGianBH;
        this.congSuat = congSuat;
    }
    public int getThoiGianBH() {
        return thoiGianBH;
    }
    public void setThoiGianBH(int thoiGianBH) {
        if(thoiGianBH > 0){
            this.thoiGianBH = thoiGianBH;
        }
        else{
            System.out.println("Thoi Gian Bao Hanh Khong Dung");
        }
    }
    public double getcongSuat() {
        return congSuat;
    }
    public void setcongSuat(double congSuat) {
        if (congSuat > 0) {
            this.congSuat = congSuat;
        } else {
            System.out.println("Cong Suat Khong Dung");
        }
    }
    
    @Override
    public String toString() {
        return super.toString() +" \t Cong Suat=" + congSuat + " \t Thoi Gian Bao Hanh=" + thoiGianBH;
    }

    
}

