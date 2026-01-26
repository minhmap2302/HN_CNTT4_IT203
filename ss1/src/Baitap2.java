import java.util.Scanner;

public class Baitap2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so ngay cham tre: ");
        int n = sc.nextInt();

        System.out.print("Nhap so luong sacsh muon: ");
        int m = sc.nextInt();

        double Total = n * m * 5000;

        if (n > 7 && m >= 3){
            Total *= 1.2;
        }

        boolean khoathe = Total > 50000;

        System.out.println("\n---Thong tin tien phat---\n");
        System.out.println("Tong tien phat: " + Total + "VND");
        System.out.println("Tien phat sau dieu chinh: " + khoathe);
    }
}
