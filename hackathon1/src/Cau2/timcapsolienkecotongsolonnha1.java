package Cau2;

import java.util.Scanner;

public class timcapsolienkecotongsolonnha1 {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Moi ban nhap mang");
        int n = sc.nextInt();sc.nextLine();

        if (n<=2){
            System.out.println("Khong hop le");
            return;
        }
        for (int i = 0; i < n; i++){
            System.out.print("Moi ban nhap chuoi: ");
            arr[i] = sc.nextInt(); sc.nextLine();
        }
        int max = arr[0];
        int sum = arr[0];
        int n1 = arr[0];
        int n2 = arr[0];
        for (int i = 0; i < n; i++){
            for (int j = i; j < n - i ; j++ ){
                sum = arr[i] + arr[j];
                if (sum>max){
                    n1 = arr[i];
                    n2 = arr[j];
                    sum = max;
                }
            }

        }
        System.out.println("cap so lien ke co tong lon nhat la: " +n1+ "va" +n2+ "(Tong la: " +sum+ ")" );

    }
}

