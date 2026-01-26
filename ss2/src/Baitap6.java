import java.util.Scanner;

public class Baitap6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantityBook , tempMax = 0 , tempMin = 999 ;
        float avgDay = 0f;
        for(int i = 1 ; i <= 7 ; i++){
            if(i+ 1 == 8){
                System.out.println("Moi luot muon ngay Chu nhat : ");
                quantityBook = sc.nextInt();
            }else {
                System.out.println("Moi luot muon ngay thu : " + (i+1));
                quantityBook = sc.nextInt();
            }
            if(quantityBook > tempMax)  tempMax = quantityBook;
            if (quantityBook < tempMin) tempMin = quantityBook;
            if(quantityBook >0 ){
                avgDay += quantityBook;
            }
        }

        System.out.println("---- KET QUA THONG KE ----");
        System.out.println("Luot muon cao nhat : " + tempMax);
        System.out.println("Luot muon thap nhat : " + tempMin);
        System.out.println("trung binh luot muon/ngay : " + (avgDay/7));
    }
}