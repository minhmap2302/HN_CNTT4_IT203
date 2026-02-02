public class Bai4 {
    private String MaNV;
    private String TenNV;
    private double slary;
    public Bai4(){
        this.MaNV="";
        this.TenNV="";
        this.slary=0;
    }
    public Bai4(String MaNV,String TenNV){
        this.MaNV=MaNV;
        this.TenNV=TenNV;
        this.slary=0;
    }
    public Bai4(String MaNV,String TenNV,double slary){
        this.MaNV=MaNV;
        this.TenNV=TenNV;
        this.slary=slary;
    }
    public void display() {
        System.out.println("Mã NV: " + MaNV);
        System.out.println("Tên NV: " + TenNV);
        System.out.println("Luong: " + slary);
    }

    public static void main(String[] args) {
        Bai4 NV1=new Bai4();
        Bai4 NV2=new Bai4("A01","Nguyen Van A");
        Bai4 NV3=new Bai4("A02","Nguyen Van B",20000000);
        NV1.display();
        NV2.display();
        NV3.display();
    }
}