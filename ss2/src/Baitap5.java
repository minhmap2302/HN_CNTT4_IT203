import java.util.Scanner;
public class Baitap5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 100;
        int day;
        System.out.println("HE THONG DANH GIA DOC GIA");
        System.out.println("Nhap so ngay tren . Nhap 999 de ket thuc");
        while (true){
            System.out.println("Nhap so ngay tre : ");
            day = sc.nextInt();
            if (day == 999){
                break;
            }
            if (day <= 0) score += 5;
            else score -= (day * 2);
        }
        System.out.println("Tong diem uy tin :" + score);
        if(score >= 120) System.out.println("Độc giả Thân thiết");
        else if (score >=  80 && score <= 119) System.out.println("Độc giả Tiêu chuẩn");
        else System.out.println("Độc giả cần lưu ý");
    }
}