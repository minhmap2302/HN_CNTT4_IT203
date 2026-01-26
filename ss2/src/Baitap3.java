import java.sql.SQLOutput;
import java.util.Scanner;
public class Baitap3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int phat = 5000;

        System.out.println("Moi ban nhap so sach tra muon: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("So ngay tre la:" + i);
            int tre = sc.nextInt();

            total = total + tre * phat;
        }
        System.out.println("Tong tien phat la: " + total);
    }
}
