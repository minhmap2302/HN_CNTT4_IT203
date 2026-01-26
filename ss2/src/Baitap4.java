import java.util.Scanner;
public class Baitap4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.println("Nhap ma id sach: ");
            id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Ma ko hop le hay nhap lai");
            }

        } while (id <= 0);
        System.out.println("Luu ma thanh cong");
    }
}
