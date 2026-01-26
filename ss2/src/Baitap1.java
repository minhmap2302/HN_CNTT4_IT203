import java.util.Scanner;
public class Baitap1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap tuoi : ");
        int age = sc.nextInt();
        System.out.println("moi so sach dang muon :");
        int book = sc.nextInt();
        if (age >= 18 && (book >= 0 && book <= 3)){
            System.out.println("Ket qua : Ban da du dieu kien");
        } else if (age >= 18 && book >= 4 ) {
            System.out.println("Ket qua : khong du dieu kien");
            System.out.println("- Ly do : Ban da muon toi da 3 quyen");
        }else {
            System.out.println("Ket qua : khong du dieu kien");
            System.out.println("- Ly do : Ban phai tu 18 tuoi tro len");
        }
    }
}