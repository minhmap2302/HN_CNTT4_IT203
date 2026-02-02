//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bai1 {
    public String Masv;
    public String HoTen;
    public String NamSinh;
    public double DiemTB;

    public Bai1(String MaSv, String HoTen, String NamSinh, double DiemTB) {
        this.Masv = MaSv;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.DiemTB = DiemTB;
    }
    public void hienthithongtin(){
        System.out.println("MaSV:"+Masv);
        System.out.println("Ho Va Ten:"+HoTen);
        System.out.println("Nam Sinh:"+NamSinh);
        System.out.println("DiemTB:"+DiemTB);
    }
    public static void main(String[] args) {
        Bai1 sv1 = new Bai1("B21", "NguyenVanA", "2006-12-21", 8.2);
        Bai1 sv2 = new Bai1("B22", "NguyenVanB", "2006-12-22", 8.9);
        sv1.hienthithongtin();
        sv2.hienthithongtin();
    }
}