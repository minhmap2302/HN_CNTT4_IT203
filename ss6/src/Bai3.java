import java.util.Scanner;

public class Bai3 {
    private String MaSp;
    private String TenSp;
    private double price;
    public Bai3(String MaSp,String TenSp,double price){
        this.MaSp=MaSp;
        this.TenSp=TenSp;
        this.price=price;
    }
    public void display() {
        System.out.println("Mã SP: " + MaSp);
        System.out.println("Tên SP: " + TenSp);
        System.out.println("Giá bán: " + price);
    }
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.price = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ! Giá phải > 0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai3 product=new Bai3("P01","Chuot Gaming",200000);
        product.display();
        System.out.print("Moi ban nhap gia moi:");
        double price=sc.nextDouble();
        product.setGiaBan(price);
        product.display();
    }
}