public class Bai5 {
    private String MaSach;
    private String TenSach;
    private String TacGia;
    private double price;
    public Bai5(String MaSach,String TenSach,String TacGia,double price){
        this.MaSach=MaSach;
        this.TenSach=TenSach;
        this.TacGia=TacGia;
        this.price=price;
    }
    public void display(){
        System.out.println("Ma Sach:"+MaSach);
        System.out.println("Ten Sach:"+TenSach);
        System.out.println("Tac Gia:"+TacGia);
        System.out.println("Price:"+TacGia);
    }

    public static void main(String[] args) {
        Bai5 book1=new Bai5("B001","Doraemon","fujiko Fujio",5000);
        book1.display();
    }
}